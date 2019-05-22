package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
/**
 * 这是一个用户操作的具体实现类
 * @author 小杨
 * @version V10.0
 */
public class UserDaoImpl implements UserDao {
	//多个对象公用一个
	private static ArrayList<User> array = new ArrayList<User>();
	@Override
	public boolean isLigin(String UserName, String Password) {
		// TODO Auto-generated method stub
		//遍历集合 获取每一个用户 判断用户的密码与名是否匹配
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
