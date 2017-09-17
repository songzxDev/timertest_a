/**   
* @Title: MyCancleTaskA.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午8:01:59 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyCancleTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午8:01:59
 * 
 */
public class MyCancleTaskA extends TimerTask {

	/**
	 * @Date: 2017年9月17日下午8:01:59
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println("A run timer=" + new Date());
		/*
		 * TimerTask类中的cancle()方法的作用是将自身从任务队列中进行清除，其他任务不受影响。
		 */
		this.cancel();
		System.out.println("A 任务自己移除自己！");
	}

}
