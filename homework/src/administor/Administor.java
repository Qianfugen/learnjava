package administor;

/**
 * 定义Administor类
 * @author root
 * @version 4.0 2019-07-19
 */
public class Administor {
	//定义私有变量
	private String username;
	private String password;
	private boolean isRegister;
	
	/**
	 * 缺省构造方法
	 */
	public Administor() {
	
	}
	
	/**
	 * 有参构造方法
	 * @param username	用户名
	 * @param password	密码
	 */
	public Administor(String username, String password) {
		this.username=username;
		this.password=password;
	}

	public void register(String username, String password) {
		if(!isRegister) {
			this.username=username;
			this.password=password;
			System.out.println("注册成功！");
			isRegister=true;
		}else {
			System.out.println("您已注册，请登录！");
		}
	}
	
	public void login(String username, String password) {
		if(isRegister) {
			if(username.equals(this.username) && password.equals(this.password)) {
				System.out.println("登陆成功！");
			}else {
				System.out.println("密码输入错误！");
			}
		}else {
			System.out.println("您还没注册，请先注册！");
		}
	}
}
