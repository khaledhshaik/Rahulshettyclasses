package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Lala");
		hm.put(2, "Good");
		hm.put(3, "Morning");
		hm.put(4, "Best");
		System.out.println(hm);
        System.out.println(hm.get(3));
        hm.remove(2);
        System.out.println(hm.get(2));
        Set sn= hm.entrySet();
        Iterator it=sn.iterator();
        while(it.hasNext())
        {
        	Map.Entry mp=(Map.Entry)it.next();
        	System.out.println(mp.getKey());
        	System.out.println(mp.getValue());
        }
	}

}
