package com.lata.capdemos.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(101);
		l.add(103);
		l.add(102);
		l.add(104);
		System.out.println(l);
		for(Object temp:l)
		{
			System.out.println(temp);
		}
		//------------------------
		Iterator it=l.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		Hashtable ht=new Hashtable();
		ht.put(125, "A");
		ht.put(110, "B");
		ht.put(130, "C");
		System.out.println(ht);
		
		Map mp=new HashMap();
		mp.put(125, "A");
		mp.put(110, "B");
		mp.put(130, "C");
		System.out.println(mp);
		
		Set s=mp.keySet();
		Iterator it1=s.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj+"\t"+mp.get(obj));
		}	
	}
}
