package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是用户进行操作的接口
 * 
 * @author 小杨
 *
 */
public interface UserDao {
	/**
	 * 这是登录功能
	 * 
	 * @param UserName 用户名
	 * @param Password 密码
	 * @return 返回登录是否成功
	 * 
	 */
	public abstract boolean isLigin(String UserName, String Password);
	/**
	 * 这是用户注册功能
	 * @param user  要注册的用户信息
	 */
	public abstract void regist(User user);
}
