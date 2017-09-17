/**   
* @Title: MyLaterTask.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午6:59:33 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyLaterTask
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午6:59:33
 * 
 */
public class MyLaterTaskB extends TimerTask {

	/**
	 * @Date: 2017年9月17日下午6:59:33
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		System.out.println("MyLaterTaskB begin timer=" + new Date());
		System.out.println("MyLaterTaskB   end timer=" + new Date());
	}

}
