/**   
* @Title: MyLaterTask.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����6:59:33 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyLaterTask
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����6:59:33
 * 
 */
public class MyLaterTaskA extends TimerTask {

	/**
	 * @Date: 2017��9��17������6:59:33
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	@Override
	public void run() {
		try {
			System.out.println("MyLaterTaskA begin timer=" + new Date());
			Thread.sleep(20000L);
			System.out.println("MyLaterTaskA   end timer=" + new Date());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
