/**   
* @Title: MyCancleErrorTaskA.java 
* @Package cn.songzx.timertest_a.mytask 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��17�� ����8:19:54 
* @version V1.0   
*/
package cn.songzx.timertest_a.mytask;

import java.util.TimerTask;

/**
 * @ClassName: MyCancleErrorTaskA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��17�� ����8:19:54
 * 
 */
public class MyCancleErrorTaskA extends TimerTask {

	private int i;

	/**
	 * @Date: 2017��9��17������8:20:29
	 * @Title: MyCancleErrorTaskA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param i
	 */
	public MyCancleErrorTaskA(int i) {
		super();
		this.i = i;
	}

	/**
	 * @Date: 2017��9��17������8:19:54
	 * @Title: run
	 * @Description: TODO(������һ�仰�����������������)
	 * @return ����ֵ����
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��" + i + "��û�б�cancelȡ��");
	}

}
