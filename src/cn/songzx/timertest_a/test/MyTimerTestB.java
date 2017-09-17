/**   
* @Title: MyTimerTestB.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����9:48:59 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestB
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����9:48:59
 * 
 */
public class MyTimerTestB {

	private static class MyTask extends TimerTask {

		/**
		 * @Date: 2017��9��17������9:49:32
		 * @Title: run
		 * @Description: TODO(������һ�仰�����������������)
		 * @return ����ֵ����
		 */
		@Override
		public void run() {
			try {
				System.out.println("begin timer=" + System.currentTimeMillis());
				Thread.sleep(5000L);
				System.out.println("  end timer=" + System.currentTimeMillis());
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void testA() {
		MyTask task = new MyTask();
		Calendar calendarRef = Calendar.getInstance();
		Date runDate = calendarRef.getTime();
		Timer timer = new Timer();
		/*
		 * �ڲ���ʱ������£����ִ�������ʱ��û�б��ӳ٣�����һ��ִ������Ŀ�ʼʱ������һ������Ŀ�ʼʱ�����periodʱ��
		 */
		timer.schedule(task, runDate, 3000L);
	}

	public static void testB() {
		MyTask task = new MyTask();
		System.out.println("��ǰʱ�䣺" + System.currentTimeMillis());
		Timer timer = new Timer();
		/*
		 * �ڲ��ӳٵ�����£����ִ�������ʱ��û�б��ӳ٣����һ��ִ�������ʱ��������ʼʱ�����delayʱ�䣬
		 * ������ִ�������ʱ������һ������Ŀ�ʼʱ�����periodʱ��
		 */
		timer.schedule(task, 3000L, 4000L);
	}

	public static void testC() {
		MyTask task = new MyTask();
		Calendar calendarRef = Calendar.getInstance();
		Date runDate = calendarRef.getTime();
		Timer timer = new Timer();
		/*
		 * ���ӳٵ�����£����ִ�������ʱ�䱻�ӳ٣���ô��һ�������ִ��ʱ��������һ�����������ʱ����Ϊ�ο�������
		 */
		timer.schedule(task, runDate, 2000L);
	}

	public static void testD() {
		MyTask task = new MyTask();
		System.out.println("��ǰʱ�䣺" + System.currentTimeMillis());
		Timer timer = new Timer();
		/*
		 * ���ӳٵ�����£����ִ�������ʱ�䱻�ӳ٣���ô��һ�������ִ��ʱ��������һ�����������ʱ����Ϊ�ο�������
		 */
		timer.schedule(task, 3000L, 2000L);
	}

	/**
	 * @Date: 2017��9��17������9:48:59
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		testD();
	}

}
