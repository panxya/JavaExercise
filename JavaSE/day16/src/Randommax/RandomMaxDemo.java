package Randommax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


//0 ��ֹͣ  20֮��
public class RandomMaxDemo {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(true) {
			int a =r.nextInt(2)+1;
			if (a != 0) {
				array.add(a);
			}else {
				break;
			}
		}
		Integer[] i = new Integer[array.size()-1];
		array.toArray(i);
		Arrays.sort(i);
		
		System.out.println("�����ǣ�"+ArrayToString(i));
			
	}
	public static String ArrayToString(Integer[] i) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int x= 0;x<i.length;x++) {
			if(x == i.length-1) {
				sb.append(i[x]);
			}else {
				sb.append(i[x]).append(", ");
			}
				
			
		}
		
		sb.append("]");
		return sb.toString();
	}
}
