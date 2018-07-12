package testproject;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("test1");
		array.add("test2");
		array.add("test3");
		array.add("test4");
		System.out.println(array.get(1));
		
		array.forEach(str ->
		System.out.println(str));

	}
}

