/**   
* @Title: MyTask.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����5:39:26 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyTask
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����5:39:26
 * 
 */
public class MyTask extends TimerTask {

	/**
	 * @Date: 2017��9��17������5:39:26
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����ִ���ˣ�ʱ��Ϊ��" + new Date());
	}

}
