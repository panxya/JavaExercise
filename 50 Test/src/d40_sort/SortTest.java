package d40_sort;

import java.util.Arrays;

//×Ö·û´®ÅÅÐò
//if(str[j].compareTo(str[j+1])<0){ ´óµ½Ð¡
public class SortTest {
	public static void main(String[] args) {
		String[] s = {"a","b","c","d","a","d"};
		for(int i =0;i<s.length;i++) {
			for(int j = 0;j<s.length -1-i;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		for(String ss:s) {
			System.out.print(ss+" ");
		}
		System.out.println(Arrays.toString(s));
	}
}
