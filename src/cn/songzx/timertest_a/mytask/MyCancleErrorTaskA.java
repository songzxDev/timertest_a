/**   
* @Title: MyCancleErrorTaskA.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月17日 下午8:19:54 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.TimerTask;

/**
 * @ClassName: MyCancleErrorTaskA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月17日 下午8:19:54
 * 
 */
public class MyCancleErrorTaskA extends TimerTask {

	private int i;

	/**
	 * @Date: 2017年9月17日下午8:20:29
	 * @Title: MyCancleErrorTaskA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param i
	 */
	public MyCancleErrorTaskA(int i) {
		super();
		this.i = i;
	}

	/**
	 * @Date: 2017年9月17日下午8:19:54
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("第" + i + "次没有被cancel取消");
	}

}
