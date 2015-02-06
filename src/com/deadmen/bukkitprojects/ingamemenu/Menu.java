package com.deadmen.bukkitprojects.ingamemenu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Menu {

	private Object key;
	public Menu(Object key){this.key = key;MenuMap.addMenu(key, this);}
	public void removeMenu(){MenuMap.removeMenu(key);}
	
	private int currentID = 1;
	public int getCurrentSlide(){return currentID;}
	public void setCurrentSlide(int id){currentID = id;}
	public void setID(int id){currentID = id;} //this is because method names are long and im lazy and f**k you for asking why its here.
	
	private Object event;
	public Object getEvent(){return event;}
	
	public void invoke(Object event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		this.event = event;
		for(Method m: this.getClass().getDeclaredMethods()){
			if(m.isAnnotationPresent(Menu.RuntimeID.class)){
				if(m.getAnnotation(Menu.RuntimeID.class).value()==currentID/*currentValue*/){
					m.invoke(this);
					return;
				}
			}
		}
	}
	
	@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.METHOD)public static @interface RuntimeID {int value() default 0;}
}
