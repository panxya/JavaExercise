package TreeMapArrayList;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

//  �Ĵ���������
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,ArrayList<String>> tmsl = new TreeMap<String,ArrayList<String>>();
		
		ArrayList<String> hlm = new ArrayList<String>();
		ArrayList<String> shv = new ArrayList<String>();
		ArrayList<String> xyj = new ArrayList<String>();
		ArrayList<String> sgyy = new ArrayList<String>();
	
		hlm.add("�ֱ���");
		hlm.add("������");
		tmsl.put("��¥��", hlm);
				
		shv.add("�ֳ�");
		shv.add("����");		
		tmsl.put("ˮ䰴�", shv);
		
		xyj.add("���");
		xyj.add("��");
		tmsl.put("���μ�", xyj);
		
		sgyy.add("���");
		sgyy.add("����");
		tmsl.put("��������", sgyy);
		
		Set<String> set = tmsl.keySet();
		for(String key : set) {
			System.out.println(key);
			ArrayList<String> value = tmsl.get(key);
			for(String a :value) {
				System.out.println("\t"+a);
			}
		}
		
		
		
	}
}
