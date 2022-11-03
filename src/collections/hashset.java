package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("UAE");
		hs.add("INDIA");
		hs.add("BALI");
		System.out.println(hs);
		System.out.println(hs.remove("BALI"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.getClass());
		System.out.println(hs.clone());
		
		Iterator<String> i=hs.iterator();     ////iterator use
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}

}
