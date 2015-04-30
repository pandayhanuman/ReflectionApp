package com.man.ref;

public class RefTest {

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		Class cl=Simple.class;
		Class x=int.class;
		try { 
	//		Class<?> cl=Class.forName("com.man.ref.Simple");
			System.out.println(cl.getName());
			System.out.println(x.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
