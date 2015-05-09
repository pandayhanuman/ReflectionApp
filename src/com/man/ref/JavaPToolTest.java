package com.man.ref;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class JavaPToolTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the fully Qualified name of class  ");
		String str=s.next();
		
		try {
			Class cl=Class.forName(str);
			
			System.out.println("\nClass Name is.....\n\n"+cl.getName()+"\n\n Field are ............\n");
			Field[] field=cl.getDeclaredFields();
			for (Field f:field) {
				System.out.println(f);
			}

			System.out.println("\nConstructor are........\n");
			Constructor<?> cons[]=cl.getDeclaredConstructors();
			for(Constructor<?> con:cons){
				 System.out.println(con);
			}
			System.out.println("\nMethods are........\n");
			Method methods[]=cl.getDeclaredMethods();
			for(Method m:methods){
				System.out.println(m);
			}
			System.out.println("\nAnnotations are......\n");
			Annotation[] ann=cl.getDeclaredAnnotations();
			for(Annotation a:ann){
				System.out.println(a);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
