package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * �����û����в����Ľӿ�
 * 
 * @author С��
 *
 */
public interface UserDao {
	/**
	 * ���ǵ�¼����
	 * 
	 * @param UserName �û���
	 * @param Password ����
	 * @return ���ص�¼�Ƿ�ɹ�
	 * 
	 */
	public abstract boolean isLigin(String UserName, String Password);
	/**
	 * �����û�ע�Ṧ��
	 * @param user  Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
