//静态
//结构
//局部

class Code {
	//结构块
	{int x = 100;
	System.out.println(x);
	}	
	
	//静态块
	static {int y = 200;
	System.out.println(y);
	}
	
	//构造方法
	public Code(int b) {
	System.out.println("300");
	}

}

class CodeDemo {
	public static void main(String[] args) {
	//局部块
	
		{int z = 400;
		System.out.println(z);
		}
		
	//创建方法
		Code b = new Code(2);
		System.out.println("------");
		Code bb = new Code(1);
	}
}