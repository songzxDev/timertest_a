/**   
* @Title: MyTest.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����5:40:26 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import cn.songzx.timertest_a.mytask.MyTask;

/**
 * @ClassName: MyTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����5:40:26
 * 
 */
public class MyTest {

	/**
	 * @Date: 2017��9��17������5:40:26
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		testC();
	}

	public static void testA() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		MyTask task = new MyTask();
		/*
		 * ����һ��Timer��������һ���µ��̣߳���ô������������̲߳������ػ��̣߳���һֱ������ȥ
		 */
		Timer timer = new Timer();
		timer.schedule(task, runDate);
	}

	public static void testB() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		MyTask task = new MyTask();
		/*
		 * TimerTask�е����񲻱�ִ�У���Ϊ�����Ѿ�����
		 */
		Timer timer = new Timer(true);// �ػ��߳�
		timer.schedule(task, runDate);
	}

	public static void testC() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		/*
		 * ���ִ�������ʱ�����ڵ�ǰʱ�䣬������ִ��task����
		 */
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate);
		MyTask mytask = new MyTask();
		Timer timer = new Timer();
		timer.schedule(mytask, runDate);
	}

	public static void tesdD() {

	}

}
