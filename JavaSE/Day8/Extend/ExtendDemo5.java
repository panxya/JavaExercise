class Father {
	int n = 1;
}

class Son extends Father {
	int n = 2;
	public void show() {
		int n =3;
		System.out.println(n);
		System.out.println(this.n);
		System.out.println(super.n);
	}
}


class ExtendDemo5 {
	public static void main(String[] args) {
	Son s = new Son();
	s.show();
	}
}