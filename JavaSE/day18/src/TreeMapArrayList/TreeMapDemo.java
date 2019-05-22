package TreeMapArrayList;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

//  四大名著人物
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,ArrayList<String>> tmsl = new TreeMap<String,ArrayList<String>>();
		
		ArrayList<String> hlm = new ArrayList<String>();
		ArrayList<String> shv = new ArrayList<String>();
		ArrayList<String> xyj = new ArrayList<String>();
		ArrayList<String> sgyy = new ArrayList<String>();
	
		hlm.add("贾宝玉");
		hlm.add("林黛玉");
		tmsl.put("红楼梦", hlm);
				
		shv.add("林冲");
		shv.add("西门");		
		tmsl.put("水浒传", shv);
		
		xyj.add("悟空");
		xyj.add("悟净");
		tmsl.put("西游记", xyj);
		
		sgyy.add("诸葛");
		sgyy.add("刘备");
		tmsl.put("三国演义", sgyy);
		
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
