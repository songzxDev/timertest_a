/**   
* @Title: MyTimerTestD.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����10:22:31 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestD
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����10:22:31
 * 
 */
public class MyTimerTestD {

	private static class MyTaskA extends TimerTask {

		/**
		 * @Date: 2017��9��17������10:23:40
		 * @Title: run
		 * @Description: TODO(������һ�仰�����������������)
		 * @return ����ֵ����
		 */
		@Override
		public void run() {
			System.out.println("begin timer=" + new Date());
			System.out.println("  end timer=" + new Date());
			System.out.println();

		}

	}

	public static void testA() {
		MyTaskA task = new MyTaskA();
		System.out.println("���ڵ�ִ��ʱ�䣺" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ���ִ��ʱ�䣺" + runDate);
		Timer timer = new Timer();
		timer.schedule(task, runDate, 2000L);
	}

	private static class MyTaskB extends TimerTask {

		/**
		 * @Date: 2017��9��17������10:23:43
		 * @Title: run
		 * @Description: TODO(������һ�仰�����������������)
		 * @return ����ֵ����
		 */
		@Override
		public void run() {
			System.out.println("begin timer=" + new Date());
			System.out.println("  end timer=" + new Date());
			System.out.println();

		}

	}

	public static void testB() {
		MyTaskB task = new MyTaskB();
		System.out.println("���ڵ�ִ��ʱ�䣺" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("�ƻ���ִ��ʱ�䣺" + runDate);
		Timer timer = new Timer();
		/*
		 * ������ʱ����ڵ�ʱ������Ӧ��Task���񱻡������ԡ���ִ�У������Task����׷������
		 */
		timer.scheduleAtFixedRate(task, runDate, 2000L);
	}

	/**
	 * @Date: 2017��9��17������10:22:31
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param args
	 * @return void ����ֵ����
	 */
	public static void main(String[] args) {
		testB();

	}

}
