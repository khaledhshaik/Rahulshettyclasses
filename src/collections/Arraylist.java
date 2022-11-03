package collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
			a.add("Khaled");
			a.add("JAVA");
			a.add("guddu");
			System.out.println(a);
			a.add(0, "Farhan");
			a.add(1, "salman");
			System.out.println(a);
			a.remove(2);
			a.remove("JAVA");
			System.out.println(a);
			System.out.println(a.get(2));
			System.out.println(a.contains("salman"));
			System.out.println(a);
			System.out.println(a.indexOf("guddu"));
			System.out.println(a.isEmpty());
			System.out.println(a.size());
			a.removeAll(a);
			System.out.println(a);
	}

}

