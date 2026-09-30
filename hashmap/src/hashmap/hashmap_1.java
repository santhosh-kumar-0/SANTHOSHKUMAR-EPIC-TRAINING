package hashmap;

import java.util.HashMap;

public class hashmap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map1 = new HashMap<>();
		HashMap<Float,Integer> map2 = new HashMap<>();
		HashMap<Character,Integer> map3 = new HashMap<>();
		
		map1.put("apple", 100);
		
		map2.put(100.0f, 100);
		
		map3.put('A', 100);
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);

	}

}
