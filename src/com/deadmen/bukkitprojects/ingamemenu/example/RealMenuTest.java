package com.deadmen.bukkitprojects.ingamemenu.example;

import com.deadmen.bukkitprojects.ingamemenu.Menu;
import com.deadmen.bukkitprojects.ingamemenu.Menu.RuntimeID;

public class RealMenuTest extends Menu {

	public RealMenuTest(Object key) {
		super(key);
		System.out.print("SuperCoolMenu!\n1.\tCoolStuff\n2.\tNotSoCoolStuff\n3.\tAlrightStuff\n\nChoice: ");
	}

	@RuntimeID(1)
	public void b(){
		if(getEvent()!= null){
			if(getEvent() instanceof String){
				if(getNumberChoice() == 1){
					System.out.println("<==CoolStuff==>\n1.\tPizza\n2.\tSoda\n3.\tBack");
					setID(2);
				}else if(getNumberChoice() == 2){
					System.out.println("<==NotSoCoolStuff==>\n1.\tSchool\n2.\tHomework\n3.\tBack");
					setID(3);
				}else if(getNumberChoice() == 3){
					System.out.println("<==AlrightStuff==>\n1.\tTV\n2.\tAdvertiesments\n3.\tBack");
					setID(4);
				}else{
					System.out.println("Invalid Response! Only Enter The Number!");
				}
			
			}
		}
		System.out.print("\nChoice: ");
	}

	@RuntimeID(2)
	public void c(){
		if(getEvent()!= null){
			if(getEvent() instanceof String){
				if(getNumberChoice() == 1){
					System.out.println("Who doesn't love pizza?!");
					removeMenu();
				}else if(getNumberChoice() == 2){
					System.out.println("Mmmmm Coke :3");
					removeMenu();
				}else if(getNumberChoice() == 3){
					System.out.print("SuperCoolMenu!\n1.\tCoolStuff\n2.\tNotSoCoolStuff\n3.\tAlrightStuff\n");
					setID(1);
				}else{
					System.out.println("Invalid Response! Only Enter The Number!");
				}
			}
		}
	}
	
	@RuntimeID(3)
	public void d(){
		if(getEvent()!= null){
			if(getEvent() instanceof String){
				if(getNumberChoice() == 1){
					System.out.println("School really sucks. Our education System needs to be revised.");
					removeMenu();
				}else if(getNumberChoice() == 2){
					System.out.println("Homework was created by the devil!");
					removeMenu();
				}else if(getNumberChoice() == 3){
					System.out.print("SuperCoolMenu!\n1.\tCoolStuff\n2.\tNotSoCoolStuff\n3.\tAlrightStuff\n");
					setID(1);
				}else{
					System.out.println("Invalid Response! Only Enter The Number!");
				}
			}
		}
	}
	
	@RuntimeID(4)
	public void e(){
		if(getEvent()!= null){
			if(getEvent() instanceof String){
				if(getNumberChoice() == 1){
					System.out.println("A lot of time spent watching TV is actually spent watching advertiesments.");
					removeMenu();
				}else if(getNumberChoice() == 2){
					System.out.println("Advertiesments are important but annoying as f**k.");
					removeMenu();
				}else if(getNumberChoice() == 3){
					System.out.print("SuperCoolMenu!\n1.\tCoolStuff\n2.\tNotSoCoolStuff\n3.\tAlrightStuff\n");
					setID(1);
				}else{
					System.out.println("Invalid Response! Only Enter The Number!");
				}
			}
		}
	}
	
	
	public int getNumberChoice(){
		try{
			return Integer.parseInt(((String)getEvent()).toCharArray()[0]+"");
		}catch(Exception e){}
		return -1;
	}
	
}
