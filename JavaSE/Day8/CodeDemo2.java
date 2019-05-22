//静态块  构造块 构造法
class Code2 {
	//静态块
	static {
	System.out.println("静态块");
	}
	//构造块
	{
	System.out.println("结构块");
	}
	//构造法
	Code2() {
	System.out.println("我是一个结构方法");
	
	}
}


class CodeDemo2 {
	static {
		System.out.println("这是一个静态的局部方法吧");
	}
	public static void main(String[] args) {
		System.out.println("main方法");
		{
			System.out.println("局部方法");
		}
		
		Code2 s = new Code2();
		Code2 ss = new Code2();
	}

}