package com.man.enm;

public enum EnumEx {
	  
	EnumEx(){};
	
/*
 * // within class
 * 
 	public enum month {Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec};
 	
 * */
	
	public static void main(String[] args) {
		for (month m: month.values()) {
			System.out.println(m +"\t"+m.value);
			
		}
		month m=month.Apr;
		switch(m){
		
		case Jan: 
			System.out.println(m+"\t"+m.value);
			break;
		case Feb: 
			System.out.println(m+"\t"+m.value);
			break;
		case Mar: 
			System.out.println(m+"\t"+m.value);
			break;
		case Apr: 
			System.out.println(m+"\t"+m.value);
			break;
		case May: 
			System.out.println(m+"\t"+m.value);
			break;
		case Jun: 
			System.out.println(m+"\t"+m.value);
			break;
		case Jul: 
			System.out.println(m+"\t"+m.value);
			break;
		}
		
		
	}
	
	
}
	




/* Enum can be define within or outside the class
 *  becouse it is symlar to class
 *  */
enum month {Jan(1),Feb(2),Mar(3),Apr(4),May(5),Jun(6),Jul(7),Aug(8),Sep(9),Oct(10),Nov(11),Dec(12);
	
	 public int value;
	  month(int value){
		 this.value=value;
	 }
    
}