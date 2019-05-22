package PokerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

//装盒 （HashMap ArrayList）    洗     分发     看  （ Name TreeMap  ArrayList）  
public class PokerDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		ArrayList<Integer> al = new ArrayList<Integer>();

		// 扑克制作
		String[] num = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

		String[] col = { "♠", "♥", "♣", "♦" };

		int index = 0;
		// 遍历取55
		for (String number : num) {
			for (String color : col) {
				String poker = number.concat(color);
				hm.put(index, poker);
				al.add(index);
				index++;
			}
		}

		
		hm.put(index, "大王");
		al.add(index);
		index++;
		
		hm.put(index, "小王");
		al.add(index);
		

		// 编号清洗
		Collections.shuffle(al);

		//TreeSet接收编号
		TreeSet<Integer> John = new TreeSet<Integer>();
		TreeSet<Integer> Alice = new TreeSet<Integer>();
		TreeSet<Integer> xy = new TreeSet<Integer>();
		TreeSet<Integer> Remain = new TreeSet<Integer>();
		
		for (int x = 0; x < al.size(); x++) {
			if (x>=al.size()-3) {
				Remain.add(al.get(x));
			}else if(x % 3 == 0){
				John.add(al.get(x));
			}else if(x % 3 == 1){
				Alice.add(al.get(x));
			}else if(x % 3 == 2){
				xy.add(al.get(x));
			}

		}

		//看
		lookPoker("John",John,hm);
		lookPoker("Alice",Alice,hm);
		lookPoker("xy",xy,hm);
		lookPoker("Remain",Remain,hm);
		
	}

	public static void lookPoker(String name,TreeSet<Integer> ts,
	HashMap<Integer, String> hm) {
		System.out.print(name+"的牌是：");
		for(Integer key:ts) {
			String value = hm.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
		
	}
}
