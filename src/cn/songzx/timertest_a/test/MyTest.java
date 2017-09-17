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

import cn.songzx.timertest_a.mytask.MyLaterTaskA;
import cn.songzx.timertest_a.mytask.MyLaterTaskB;
import cn.songzx.timertest_a.mytask.MyTask;

/**
 * @ClassName: MyTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午5:40:26
 * 
 */
public class MyTest {

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
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRefA = Calendar.getInstance();
		calendarRefA.add(Calendar.SECOND, 10);
		Date runDateA = calendarRefA.getTime();
		System.out.println("计划时间为：" + runDateA);

		Calendar calendarRefB = Calendar.getInstance();
		calendarRefB.add(Calendar.SECOND, 20);
		Date runDateB = calendarRefB.getTime();
		System.out.println("计划时间为：" + runDateB);

		MyTask taskA = new MyTask();
		MyTask taskB = new MyTask();
		/*
		 * Timer中允许有多个TimerTask任务及延时的测试
		 * 
		 * TimerTask是以队列的方式一个一个被顺序性地执行，所以执行的时间有可能和预期的时间不一致， 因为前面的任务有可能
		 * 耗时较长，则后面的任务运行的时间也滞后
		 */
		Timer timer = new Timer();
		timer.schedule(taskA, runDateA);
		timer.schedule(taskB, runDateB);
	}

	public static void testE() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRefA = Calendar.getInstance();
		Date runDateA = calendarRefA.getTime();
		System.out.println("A计划时间为：" + runDateA);

		Calendar calendarRefB = Calendar.getInstance();
		calendarRefB.add(Calendar.SECOND, 10);
		Date runDateB = calendarRefB.getTime();
		System.out.println("B计划时间为：" + runDateB);

		/*
		 * 在代码中设置任务1和任务2的运行时间间隔10秒，由于taskA需要用20秒执行完任务，所以taskA结束的时间就是taskB的开始时间，
		 * 不再以10秒作参考，究其原理还是因为Task是放入队列，得一个一个执行
		 */
		MyLaterTaskA laterTaskA = new MyLaterTaskA();
		MyLaterTaskB laterTaskB = new MyLaterTaskB();

		Timer timer = new Timer();
		timer.schedule(laterTaskA, runDateA);
		timer.schedule(laterTaskB, runDateB);
	}

	public static void testF() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		/*
		 * schedule(TimerTask task,Date firstTime,long period)
		 * 
		 * 该方法的作用是指定的日期之后按指定的间隔周期，无限循环地执行某一任务。
		 */
		timer.schedule(task, runDate, 4000);
	}

	public static void testG() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		// 如果计划时间早于当前时间，则立即执行task任务
		calendarRef.add(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask task = new MyTask();
		Timer timer = new Timer();
		/*
		 * schedule(TimerTask task,Date firstTime,long period)
		 * 
		 * 该方法的作用是指定的日期之后按指定的间隔周期，无限循环地执行某一任务。
		 */
		timer.schedule(task, runDate, 4000);
	}

	public static void testH() {
		System.out.println("当前时间为：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyLaterTaskA laterTaskA = new MyLaterTaskA();
		Timer timer = new Timer();
		timer.schedule(laterTaskA, runDate, 3000);
	}

	/**
	 * @Date: 2017年9月17日下午5:40:26
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		testH();
	}
}
