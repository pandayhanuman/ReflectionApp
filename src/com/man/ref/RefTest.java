package com.man.ref;

import java.lang.reflect.Method;

public class RefTest {

	public static void main(String[] args) {
		System.out.println("-------------------=======---------------------");
		Class cl=Simple.class;
		
		try { 
			Class<?> cl1=Class.forName("com.man.ref.MyMark");
		//	System.out.println(cl.getName());
			
			// check class is primitive,array or interface
	/*		
	  		System.out.println(cl.isInterface());
			System.out.println(cl1.isInterface());
	*/	
			
			//how to create instance using new Operator   Syntax of newInstance() method of Class class
		   // public T newInstance()throws InstantiationException,IllegalAccessException

			
			Simple simp=(Simple) cl.newInstance();
			simp.display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
