package com.man.other.approach;

import java.util.HashSet;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		Employee e1=new Employee("ca107","hanuman","297");
		Employee e2=new Employee("ca91","anuman","290");
		Employee e3=new Employee("ca121","numan","292");
		Employee e4=new Employee("ca11","uman","299");
		Employee e5=new Employee("ca121","man","291");
		Employee e6=new Employee("ca15","haman","298");
		
		Set<Employee> set=new HashSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		System.out.println(set);
	}

}

class Employee{
	String eid;
	String name;
	String age;
	
	
	
	public Employee(String eid, String name, String age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((eid == null) ? 0 : eid.hashCode());
		char[] charr=this.eid.toCharArray();
		result=0;
		for (int i = 0; i < charr.length; i++) {
			result=result+charr[i];
		}
		return 0;
	//Integer.parseInt(this.age)	
	//	return age.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid == null) {
			if (other.eid != null)
				return false;
		} else if (!eid.equals(other.eid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]\n";
	}
	
	
}