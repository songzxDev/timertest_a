/**   
* @Title: MyTimerTestD.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午10:22:31 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午10:22:31
 * 
 */
public class MyTimerTestD {

	private static class MyTaskA extends TimerTask {

		/**
		 * @Date: 2017年9月17日下午10:23:40
		 * @Title: run
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @return 返回值类型
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
		System.out.println("现在的执行时间：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("计划的执行时间：" + runDate);
		Timer timer = new Timer();
		timer.schedule(task, runDate, 2000L);
	}

	private static class MyTaskB extends TimerTask {

		/**
		 * @Date: 2017年9月17日下午10:23:43
		 * @Title: run
		 * @Description: TODO(这里用一句话描述这个方法的作用)
		 * @return 返回值类型
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
		System.out.println("现在的执行时间：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("计划的执行时间：" + runDate);
		Timer timer = new Timer();
		/*
		 * 将两个时间段内的时间所对应的Task任务被【补充性】的执行，这就是Task任务追赶特性
		 */
		timer.scheduleAtFixedRate(task, runDate, 2000L);
	}

	/**
	 * @Date: 2017年9月17日下午10:22:31
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		testB();

	}

}
