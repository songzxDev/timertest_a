/**   
* @Title: MyCancleTaskA.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����8:01:59 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName: MyCancleTaskA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����8:01:59
 * 
 */
public class MyCancleTaskA extends TimerTask {

	/**
	 * @Date: 2017��9��17������8:01:59
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	@Override
	public void run() {
		System.out.println("A run timer=" + new Date());
		/*
		 * TimerTask���е�cancle()�����������ǽ��������������н������������������Ӱ�졣
		 */
		this.cancel();
		System.out.println("A �����Լ��Ƴ��Լ���");
	}

}
