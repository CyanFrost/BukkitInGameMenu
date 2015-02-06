package com.deadmen.bukkitprojects.ingamemenu;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class MenuMap {

	private static HashMap<Object, Menu> menus = new HashMap<Object, Menu>();
	@Deprecated public static HashMap<Object, Menu> getMenuMap(){return menus;}
	
	public static void addMenu(Object o, Menu m){
		if(o == null) throw new RuntimeException("The Key Object Can Not Be Null!");
		if(m == null) throw new RuntimeException("The Value \"Menu\" Can Not Be Null!");
		if(menus.containsKey(o)) throw new RuntimeException("Close The Menu Before Adding A New One!");
		menus.put(o, m);
	}
	
	public static void removeMenu(Object o){
		if(!menus.containsKey(o)) throw new NullPointerException ("Key Doesn't Exist!");
		if(o == null) throw new NullPointerException("Key Can Not Be Null!");
		menus.remove(o);
		//System.out.println("Removed: " + !menus.containsKey(o));
	}
	
	public static void ifContainsThenInvoke(Object key, Object event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		if(key == null) throw new NullPointerException("Key Can Not Be Null!");
		if(menus.containsKey(key)){
			menus.get(key).invoke(event);
		}
	}
	public static void iCTI(Object key, Object event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		ifContainsThenInvoke(key, event);
	}

	public static boolean contains(String string) {
		return menus.containsKey(string);
	}
}
