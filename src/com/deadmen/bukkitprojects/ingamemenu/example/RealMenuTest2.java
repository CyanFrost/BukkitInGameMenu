package com.deadmen.bukkitprojects.ingamemenu.example;

import com.deadmen.bukkitprojects.ingamemenu.Menu;
import com.deadmen.bukkitprojects.ingamemenu.Menu.RuntimeID;

public class RealMenuTest2 extends Menu {

	public RealMenuTest2(Object key) {
		super(key);
		/*Here, in the constructor, you put the options for the root menu*/
		System.out.println(rootMenuChoices);
	}
	
	/*Here at @RuntimeID(1) you put the handling for the root menu, and the options for the first sub menus.*/
	private final String rootMenuChoices = "=-= <Root Menu> =-=\n"
										 + "1. Write\n"
										 + "2. Read\n"
										 + "3. User Creator!";
	@RuntimeID(1)
	public void rootMenu(){
		switch(getNumberChoice()){
		case 1:
			 
			break;
		case 2: 
			
			break;
		default:
				
			break;
		}
	}
	
	/*This is a level 1 sub menu. The @RuntimeID() doens't have to be in order, but its easier to work with that way.*/
	@RuntimeID(2)
	public void b(){
		
	}
	
	
	
	

	public int getNumberChoice(){
		try{
			return Integer.parseInt(((String)getEvent()).toCharArray()[0]+"");
		}catch(Exception e){}
		return -1;
	}
	
}
