package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
/**
 * ����һ���û������ľ���ʵ����
 * @author С��
 * @version V10.0
 */
public class UserDaoImpl implements UserDao {
	//���������һ��
	private static ArrayList<User> array = new ArrayList<User>();
	@Override
	public boolean isLigin(String UserName, String Password) {
		// TODO Auto-generated method stub
		//�������� ��ȡÿһ���û� �ж��û������������Ƿ�ƥ��
		boolean flag = false;
		for(User a:array) {
			if(a.getUserName().equals(UserName)&&
					a.getPassword().equals(Password)) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		
		array.add(user);
	}

}
