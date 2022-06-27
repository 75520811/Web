package project1;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list1=new ArrayList<>();
list1.add(1);
list1.add(3);
list1.add(4);

System.out.println(list1.get(2));
/*remove from the list*/
System.out.println(list1.get(1));
//linkedlist//
List num=new LinkedList<>();
num.add(1);
num.add(2);
num.add(3);
num.add(4);
System.out.println(num);
System.out.println(num.get(1));
System.out.println(num.remove(0));
/*array list*/
ArrayList <String> list2=new ArrayList<>();
list2.add("java");
list2.add("python");
list2.add("javascript");
list2.add("html");
System.out.println(list2);
Vector<String> num1=new Vector<>();
num1.add("ui");
num1.add("lj");
num1.add("mn");
num1.add("jkl");
System.out.println(num1);
/*iterator*/
Iterator<String> it=num1.iterator();
System.out.println("Elements");
while(it.hasNext()) {
	System.out.println(it.next());	
	/*set*/
	HashSet<String> set=new HashSet<String>();
	set.add("Siva");
	set.add("Sarat");
	set.add("sunil");
	set.add("mukesh");
	//HashMap
	Map<String,Integer> map=new HashMap<>();
	//inserting values to the map
	map.put("Ravi", 40);
	map.put("Eswar", 30);
	map.put("hemanth",29);
	System.out.println(map.get("Ravi"));
	System.out.println(map.keySet());
	System.out.println(map.entrySet());
	System.out.println(map.values());
	HashMap<STRING,Integer> languages=new HashMap<>();
	languages.put("Akash", 23);
	languages.put("Manu", 24);
	languages.put("Prudvi", 25);
	System.out.println(languages.get("Manu"));
	System.out.println(languages.keySet());
	System.out.println(languages.values());
	System.out.println(languages.entrySet());
	Map<String,Integer> mp1=new TreeMap<>();
	mp1.put("Arjun", 47);
	mp1.put("NTR", 45);
	mp1.put("Vijay", 50);
	mp1.put("Ronak", 29);
	System.out.println(mp1.get("Ronak"));
	System.out.println(mp1.entrySet());
	System.out.println(mp1.remove("Vijay"));
	System.out.println(mp1.keySet());
	System.out.println(mp1.values());
	
	
}
}
}
























