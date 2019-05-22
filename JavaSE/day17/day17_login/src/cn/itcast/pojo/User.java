package cn.itcast.pojo;
/**
 * 这是用户基本描述类
 * @author 小杨
 * @version V10.0
 */
public class User {
	//用户名
	//密码
	private String UserName;
	private String Password;
	
	public User() {}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
}
