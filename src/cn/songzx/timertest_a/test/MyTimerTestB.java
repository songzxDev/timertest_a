/**   
* @Title: MyTimerTestB.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午9:48:59 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午9:48:59
 * 
 */
public class MyTimerTestB {

	private static class MyTask extends TimerTask {

		/**
		 * @Date: 2017年9月17日下午9:49:32
		 * @Title: run
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @return 返回值类型
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
		 * 在不延时的情况下，如果执行任务的时间没有被延迟，则下一次执行任务的开始时间是上一次任务的开始时间加上period时间
		 */
		timer.schedule(task, runDate, 3000L);
	}

	public static void testB() {
		MyTask task = new MyTask();
		System.out.println("当前时间：" + System.currentTimeMillis());
		Timer timer = new Timer();
		/*
		 * 在不延迟的情况下，如果执行任务的时间没有被延迟，则第一次执行任务的时间是任务开始时间加上delay时间，
		 * 接下来执行任务的时间是上一次任务的开始时间加上period时间
		 */
		timer.schedule(task, 3000L, 4000L);
	}

	public static void testC() {
		MyTask task = new MyTask();
		Calendar calendarRef = Calendar.getInstance();
		Date runDate = calendarRef.getTime();
		Timer timer = new Timer();
		/*
		 * 在延迟的情况下，如果执行任务的时间被延迟，那么下一次任务的执行时间是以上一次任务结束的时间作为参考来计算
		 */
		timer.schedule(task, runDate, 2000L);
	}

	public static void testD() {
		MyTask task = new MyTask();
		System.out.println("当前时间：" + System.currentTimeMillis());
		Timer timer = new Timer();
		/*
		 * 在延迟的情况下，如果执行任务的时间被延迟，那么下一次任务的执行时间是以上一次任务结束的时间作为参考来计算
		 */
		timer.schedule(task, 3000L, 2000L);
	}

	/**
	 * @Date: 2017年9月17日下午9:48:59
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		testD();
	}

}
