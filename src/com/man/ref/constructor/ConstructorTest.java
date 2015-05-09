package com.man.ref.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ConstructorTest {

	public static void main(String[] args) {
	    String className="com.man.ref.constructor.Simple";
	    
	    Scanner scan=new Scanner(System.in);
		try {
			Class<?> cls=Class.forName(className);
			Constructor<?> cons[]=cls.getDeclaredConstructors();
			
			for(int i=0;i<cons.length;i++){
				Constructor<?> con=cons[i];
				System.out.println(con);
				Class<?>[] conparams=con.getParameterTypes();
				Object[] params=new Object[conparams.length];
				for (int j = 0; j < params.length; j++) {
					String type=conparams[j].getSimpleName();
					System.out.print("Enter value of "+type+" =");
					String value=scan.nextLine();
					if(type.equals("int")){
						params[j]=new Integer(value);
					}else if (type.equals("boolean")) {
						params[j]=new Boolean(value);
					}else if (type.equals("char")) {
						params[j]=new Character(value.charAt(0));
					}else if(type.equals("byte")){
						params[j] = new Byte(value);
					}else if(type.equals("short")){
						params[j] = new Short(value);
					}else if(type.equals("float")){
						params[j] = new Float(value);
					}else if(type.equals("long")){
						params[j] = new Long(value);
					}else if(type.equals("double")){
						params[j] = new Double(value);
					}else if(type.equals("String")){
						params[j] = new String(value);
					}
				}
				Simple obj=(Simple) con.newInstance(params);
				System.out.println(obj.name+"\t"+obj.age+"\t"+obj.sal);
				
			}
	
		}	
		 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   } catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
   }		
}


class Simple {
	String name;
	int age;
	float sal;

	public Simple(){
		System.out.println("------------successfullycalled-----0--------");	
	}
	public Simple(String name){
		this.name=name;
	System.out.println("------------successfullycalled-----1--------");			
	}
	public Simple(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("------------successfullycalled----2---------");			
	}
	public Simple(String name,int age,float sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	System.out.println("------------successfullycalled-------3------");			
	}
}