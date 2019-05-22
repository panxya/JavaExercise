package Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("高粱", "红");
		map.put("月光", "白");
		map.put("玫瑰", "红");
		map.put("帽子", "绿");
		map.put("高粱", "红");
		
		Set<String> set = map.keySet();
		for(String key :set) {
			String value = map.get(key);
			System.out.println(value+key);
		}
		
		System.out.println(map.size());
		System.out.println(map.containsValue("红"));
		System.out.println(map.containsKey("月光"));
		System.out.println(map.remove("帽子"));
		System.out.println(map.get("月光"));
	}
}
