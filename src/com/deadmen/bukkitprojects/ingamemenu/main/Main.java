package com.deadmen.bukkitprojects.ingamemenu.main;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import com.deadmen.bukkitprojects.ingamemenu.MenuMap;
import com.deadmen.bukkitprojects.ingamemenu.example.RealMenuTest;

public class Main {

	public static void main(String ... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Scanner scan = new Scanner(System.in);
		new RealMenuTest("awesomeness");
		do{
			MenuMap.iCTI("awesomeness", scan.nextLine());
		}while(MenuMap.contains("awesomeness"));
		scan.close();
	}
}
