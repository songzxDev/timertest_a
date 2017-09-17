/**   
* @Title: MyTest.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午5:40:26 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import cn.songzx.timertest_a.mytask.MyTask;

/**
 * @ClassName: MyTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午5:40:26
 * 
 */
public class MyTest {

	/**
	 * @Date: 2017年9月17日下午5:40:26
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		testC();
	}

	public static void testA() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		MyTask task = new MyTask();
		/*
		 * 创建一个Timer就是启动一个新的线程，那么这个新启动的线程并不是守护线程，会一直运行下去
		 */
		Timer timer = new Timer();
		timer.schedule(task, runDate);
	}

	public static void testB() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		MyTask task = new MyTask();
		/*
		 * TimerTask中的任务不被执行，因为进程已经结束
		 */
		Timer timer = new Timer(true);// 守护线程
		timer.schedule(task, runDate);
	}

	public static void testC() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		/*
		 * 如果执行任务的时间早于当前时间，则立即执行task任务
		 */
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask mytask = new MyTask();
		Timer timer = new Timer();
		timer.schedule(mytask, runDate);
	}

	public static void tesdD() {

	}

}
