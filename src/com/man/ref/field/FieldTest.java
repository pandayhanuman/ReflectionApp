package com.man.ref.field;

import java.lang.reflect.Field;
import java.util.Scanner;

public class FieldTest {

	public static void main(String[] args) {
		Class<?> cl=Simple.class;
		Scanner scan=new Scanner(System.in);
         try {
			Simple simple=(Simple) cl.newInstance();
		
			//How to initialize single field when name is given
	/*		
			 Field field=cl.getField("name");
			 Object value=field.get(simple);
			 value="Hanuman";
			 field.set(simple, value);
			 System.out.println("value   "+simple.name);
			 */
			
			Field[] fields=cl.getDeclaredFields();
			 for (int i = 0; i < fields.length; i++) {
				//	System.out.println(fields[i].getName()+"\t"+fields[i].getType().getSimpleName());
					Field field=fields[i];
					Object fvalue=field.get(simple);
					String type=field.getType().getSimpleName();
					System.out.println("Enter the value for "+type+"\t");
					String value=scan.nextLine();
					if(type.equals("int")){
						fvalue=new Integer(value);
					}else if (type.equals("boolean")) {
						fvalue=new Boolean(value);
					}else if (type.equals("char")) {
						fvalue=new Character(value.charAt(0));
					}else if(type.equals("byte")){
						fvalue = new Byte(value);
					}else if(type.equals("short")){
						fvalue = new Short(value);
					}else if(type.equals("float")){
						fvalue = new Float(value);
					}else if(type.equals("long")){
						fvalue = new Long(value);
					}else if(type.equals("double")){
						fvalue = new Double(value);
					}else if(type.equals("String")){
						fvalue = new String(value);
					}
					field.set(simple, fvalue);
				} 
			System.out.println(simple.name+"\t"+simple.id+"\t"+simple.bal+simple.lname);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}

class Simple{
	public String name;
	int id;
	float bal;
	String lname;
	
/**/
	
}