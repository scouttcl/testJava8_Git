package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Google");
		list1.add("Runoob");
		list1.add("Taobao");
		list1.add("Baidu");
		list1.add("Sina");

		List<String> list2 = new ArrayList<String>();
		list2.add("Google");
		list2.add("Runoob");
		list2.add("Taobao");
		list2.add("Baidu");
		list2.add("Sina");
		
		System.out.println("Java 7 sort: ");
		ListTester lt1 = new ListTester();
		lt1.sortByJava7(list1);
		System.out.println(list1);
		
		System.out.println("Java 8 sort: ");
		ListTester lt2 = new ListTester();
		lt2.sortByJava8(list2);
		System.out.println(list2);
	}
	
	private void sortByJava7(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = o2.compareTo(o1);
				return result;
			}
		});
	}
	
	private void sortByJava8(List<String> list) {
//		Collections.sort(list, (o1,o2) -> o1.compareTo(o2));
		Comparator<String> comp = (o1,o2) -> o1.compareTo(o2);
		Collections.sort(list, comp);
	}
	

}
