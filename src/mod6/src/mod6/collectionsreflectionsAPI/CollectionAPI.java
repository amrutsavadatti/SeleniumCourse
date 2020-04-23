package mod6.collectionsreflectionsAPI;

import java.util.ArrayList;
import java.util.Hashtable;


public class CollectionAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("USA");  //0
		list.add("UK");//1
		list.add("Australia");//2
		//list.add(1000);
		
		System.out.println(list.size());
		
		for(int i =0; i<list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		// key - value
		// key - unique
		Hashtable<String,String> table1 = new Hashtable<String,String>();
		table1.put("name", "John");
		table1.put("place", "tokyo");
		table1.put("postion", "HOD");
		
		System.out.println(table1.get("name"));
		
		Hashtable<String,String> table2 = new Hashtable<String,String>();
		table2.put("name", "Mohan");
		table2.put("place", "delhi");
		table2.put("postion", "exec");
		
		Hashtable<Integer, Hashtable<String, String>> emp = 
				new Hashtable<Integer, Hashtable<String, String>>();
		emp.put(100, table1);
		emp.put(101, table2);
		
		System.out.println(emp.get(101).get("name"));
		
		
	}

}
