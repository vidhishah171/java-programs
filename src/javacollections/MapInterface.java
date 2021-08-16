package javacollections;
import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashMap=new HashMap<Integer, String>();
		hashMap.put(2, "Mango");
		hashMap.put(5, "Apple");
		hashMap.put(1, "Grapes");
		hashMap.put(3, "Peach");
		hashMap.forEach((a,b)-> System.out.println(a+" ^_^ "+b));
		System.out.println();
		for(Map.Entry<Integer,String> fruits:hashMap.entrySet()) {
			System.out.println(fruits.getKey()+": "+fruits.getValue());
		}
		hashMap.replace(5, "Strawberry");
		hashMap.putIfAbsent(4, "Cherry");
		HashMap<Integer,String> hashMap2=new HashMap<Integer,String>();  
	    hashMap2.put(7,"Banana"); 
	    hashMap.putAll(hashMap2);  
	    hashMap2.put(1, "Orange");
	    System.out.println(hashMap2);
	    hashMap2.replaceAll((K,V) -> "Tomato");
	    System.out.println(hashMap2);
	    System.out.println();
	    System.out.println(hashMap);
		System.out.println(hashMap.get(4)+"\nHashCode: "+hashMap.hashCode()+"\nSize: "+hashMap.size()+"\nGet value otherwise get default value: "+hashMap.getOrDefault(6, "No value"));
		hashMap.remove(7);
		System.out.println(hashMap);
		hashMap.replace(5, "Pineapple");
		System.out.println();
		hashMap.entrySet().stream().forEach(System.out::println);
		System.out.println();
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println();
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		hashMap.keySet().stream().forEach(value -> System.out.print(value+" "));
		System.out.println();
		hashMap.values().stream().forEach(System.out::println);
	}

}
