package Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("����", "��");
		map.put("�¹�", "��");
		map.put("õ��", "��");
		map.put("ñ��", "��");
		map.put("����", "��");
		
		Set<String> set = map.keySet();
		for(String key :set) {
			String value = map.get(key);
			System.out.println(value+key);
		}
		
		System.out.println(map.size());
		System.out.println(map.containsValue("��"));
		System.out.println(map.containsKey("�¹�"));
		System.out.println(map.remove("ñ��"));
		System.out.println(map.get("�¹�"));
	}
}
