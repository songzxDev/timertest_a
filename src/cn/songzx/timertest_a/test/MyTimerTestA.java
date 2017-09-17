/**   
* @Title: MyTimerTestA.java 
* @Package cn.songzx.timertest_a.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午8:29:40 
* @version V1.0   
*/
package cn.songzx.timertest_a.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: MyTimerTestA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午8:29:40
 * 
 */
public class MyTimerTestA {

	private static class MyTask extends TimerTask {
		public void run() {
			System.out.println("运行了！时间为：" + new Date());
		}
	}

	public static void main(String[] args) {
		testB();
	}

	public static void testA() {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间为：" + new Date());
		/*
		 * schedule(TimerTask task,long
		 * delay)方法是以当前时间为参考时间，在此时间基础上延迟指定的毫秒数后执行一次任务
		 */
		timer.schedule(task, 7000L);
	}

	public static void testB() {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("当前时间为：" + new Date());
		/*
		 * schedule(TimerTask task,long delay,long
		 * period)方法是以当前时间为基准，在此时间基础上延迟指定的毫秒数，再以某一个间隔时间为周期无限次数执行某一项任务
		 * 凡是使用方法中有period参数的，都是无限次数执行TimerTask中的任务
		 */
		timer.schedule(task, 2000L, 4000L);
	}
}
