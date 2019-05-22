//¶à²ã¼Ì³Ð

class GrandFather {
	public void show() {
		System.out.println("father's father");
	}
}

class Father extends GrandFather {
	public void time() {
		System.out.println("father");
	}
}

class Son extends Father {}


class ExtendDemo2 {
	public static void main(String[] args) {
		Son s = new Son();
		s.time();
		s.show();
	}

}