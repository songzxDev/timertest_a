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

import cn.songzx.timertest_a.mytask.MyLaterTaskA;
import cn.songzx.timertest_a.mytask.MyLaterTaskB;
import cn.songzx.timertest_a.mytask.MyTask;

/**
 * @ClassName: MyTest
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����5:40:26
 * 
 */
public class MyTest {

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
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRefA = Calendar.getInstance();
		calendarRefA.add(Calendar.SECOND, 10);
		Date runDateA = calendarRefA.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDateA);

		Calendar calendarRefB = Calendar.getInstance();
		calendarRefB.add(Calendar.SECOND, 20);
		Date runDateB = calendarRefB.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDateB);

		MyTask taskA = new MyTask();
		MyTask taskB = new MyTask();
		/*
		 * Timer�������ж��TimerTask������ʱ�Ĳ���
		 * 
		 * TimerTask���Զ��еķ�ʽһ��һ����˳���Ե�ִ�У�����ִ�е�ʱ���п��ܺ�Ԥ�ڵ�ʱ�䲻һ�£� ��Ϊǰ��������п���
		 * ��ʱ�ϳ����������������е�ʱ��Ҳ�ͺ�
		 */
		Timer timer = new Timer();
		timer.schedule(taskA, runDateA);
		timer.schedule(taskB, runDateB);
	}

	public static void testE() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRefA = Calendar.getInstance();
		Date runDateA = calendarRefA.getTime();
		System.out.println("A�ƻ�ʱ��Ϊ��" + runDateA);

		Calendar calendarRefB = Calendar.getInstance();
		calendarRefB.add(Calendar.SECOND, 10);
		Date runDateB = calendarRefB.getTime();
		System.out.println("B�ƻ�ʱ��Ϊ��" + runDateB);

		/*
		 * �ڴ�������������1������2������ʱ����10�룬����taskA��Ҫ��20��ִ������������taskA������ʱ�����taskB�Ŀ�ʼʱ�䣬
		 * ������10�����ο�������ԭ������ΪTask�Ƿ�����У���һ��һ��ִ��
		 */
		MyLaterTaskA laterTaskA = new MyLaterTaskA();
		MyLaterTaskB laterTaskB = new MyLaterTaskB();

		Timer timer = new Timer();
		timer.schedule(laterTaskA, runDateA);
		timer.schedule(laterTaskB, runDateB);
	}

	public static void testF() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		/*
		 * schedule(TimerTask task,Date firstTime,long period)
		 * 
		 * �÷�����������ָ��������֮��ָ���ļ�����ڣ�����ѭ����ִ��ĳһ����
		 */
		timer.schedule(task, runDate, 4000);
	}

	public static void testG() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		// ����ƻ�ʱ�����ڵ�ǰʱ�䣬������ִ��task����
		calendarRef.add(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		/*
		 * schedule(TimerTask task,Date firstTime,long period)
		 * 
		 * �÷�����������ָ��������֮��ָ���ļ�����ڣ�����ѭ����ִ��ĳһ����
		 */
		timer.schedule(task, runDate, 4000);
	}

	public static void testH() {
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��" + runDate);
		MyLaterTaskA laterTaskA = new MyLaterTaskA();
		Timer timer = new Timer();
		timer.schedule(laterTaskA, runDate, 3000);
	}

	/**
	 * @Date: 2017��9��17������5:40:26
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		testH();
	}
}
