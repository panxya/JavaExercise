/*
math������ִ�л�����ѧ����ķ���

û�о�̬

���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0������ֵ��һ��α���ѡ��������ڸ÷�Χ�ڣ����ƣ����ȷֲ��� 
*/

class MathMemo {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		//0-100��
		for(int x = 0;x<100;x++) {
			int n = (int)(Math.random()*100)+1;
			System.out.println(n);
		}
	}
}
