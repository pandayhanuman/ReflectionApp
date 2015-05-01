package com.man.ref;

import java.lang.reflect.Method;

public class RefTest {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		Class cl=Simple.class;
		
		try { 
			Class<?> cl1=Class.forName("com.man.ref.MyMark");
		//	System.out.println(cl.getName());
			System.out.println(cl.isInterface());
			System.out.println(cl1.isInterface());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
