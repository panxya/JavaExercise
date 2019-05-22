package d49_count;

public class Count {

	public static void main(String[] args) {
		String s = "aaasjdhfjss jdhfddddss dfess";
		char[] chs = s.toCharArray();
		int count  = 0;
		for(int i = 0;i<chs.length;i++) {
			if(chs[i]==' ') {
				count++;}
				
		}
		System.out.println(count);
	}
}
