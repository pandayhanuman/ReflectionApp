package com.man.enm;

public enum EnumEx {
	  
	EnumEx(){};
	public enum month {Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec};
	public static void main(String[] args) {
		for (month m: month.values()) {
			System.out.println(m +"\t");
		}
		
		System.out.println(month.valueOf(null));
	}
}
	




// enum MONTH { "Jan","Feb","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec" }