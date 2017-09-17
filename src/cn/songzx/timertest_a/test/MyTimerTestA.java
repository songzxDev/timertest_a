/**   
* @Title: MyTimerTestA.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����8:29:40 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����8:29:40
 * 
 */
public class MyTimerTestA {

	private static class MyTask extends TimerTask {
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date());
		}
	}

	public static void main(String[] args) {
		testB();
	}

	public static void testA() {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		/*
		 * schedule(TimerTask task,long
		 * delay)�������Ե�ǰʱ��Ϊ�ο�ʱ�䣬�ڴ�ʱ��������ӳ�ָ���ĺ�������ִ��һ������
		 */
		timer.schedule(task, 7000L);
	}

	public static void testB() {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ��Ϊ��" + new Date());
		/*
		 * schedule(TimerTask task,long delay,long
		 * period)�������Ե�ǰʱ��Ϊ��׼���ڴ�ʱ��������ӳ�ָ���ĺ�����������ĳһ�����ʱ��Ϊ�������޴���ִ��ĳһ������
		 * ����ʹ�÷�������period�����ģ��������޴���ִ��TimerTask�е�����
		 */
		timer.schedule(task, 2000L, 4000L);
	}
}
