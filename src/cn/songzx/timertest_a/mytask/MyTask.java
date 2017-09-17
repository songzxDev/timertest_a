/**   
* @Title: MyTask.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午5:39:26 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyTask
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午5:39:26
 * 
 */
public class MyTask extends TimerTask {

	/**
	 * @Date: 2017年9月17日下午5:39:26
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("任务执行了，时间为：" + new Date());
	}

}
