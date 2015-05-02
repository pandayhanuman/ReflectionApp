package com.vish.hanuman;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MainTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("90", "vivek");
		Employee e2 = new Employee("50", "keshav");
		Employee e3 = new Employee("40", "aman");
		Employee e4 = new Employee("20", "neeraj");
		Employee e5 = new Employee("10", "bineet");
		Employee e6 = new Employee("110", "Ajay");
		Employee e7 = new Employee("60", "hanuman");
		Employee e8 = new Employee("80", "santosh");
		Employee e9 = new Employee("70", "prabhat");
		Employee e10 = new Employee("120", "kumar");
		Employee e11 = new Employee("30", "ritesh");
		Employee e12 = new Employee("100", "ritesh");
		
		Map<Employee,Employee> map=new HashMap<Employee, Employee>(300,100);
		map.put(e1, e1);
		map.put(e2, e2);
		map.put(e3, e3);
		map.put(e4, e4);
		map.put(e5, e5);
		map.put(e6, e6);
		map.put(e7, e7);
		map.put(e8, e8);
		map.put(e9, e9);
		map.put(e10, e10);
		map.put(e11, e11);
		map.put(e12, e12);

//		Department d=new Department(map);
//    Map<String,Employee> emp1=new TreeMap<String, Employee>(map);
/*	Set<Employee> key=	map.keySet();
	
	
	for (Employee emp:key) {
		System.out.println(emp);
	}*/
     System.out.println("=================2==================");
  /*   public Map<Integer,Channel> getSortChannelMap(Map<Map<Integer,Channel>>){
    	 Map<Employee, Employee> se=new TreeMap<Employee, Employee>(new NameComp());
    		se.putAll(map);
    	 return se;
     }*/
	Map<Employee, Employee> se=new TreeMap<Employee, Employee>(new NameComp());
	se.putAll(map);
	
	System.out.println(se.keySet());
	
	
	
	
	
	
	System.out.println("==================3=====================");
	
	
	Map<Integer,Employee> map1=new HashMap<Integer, Employee>();
	map1.put(1, e1);
	map1.put(2, e2);
	map1.put(3, e3);
	map1.put(4, e4);
	map1.put(5, e5);
	map1.put(6, e6);
	map1.put(7, e7);
	map1.put(8, e8);
	map1.put(9, e9);
	map1.put(10, e10);
	map1.put(11, e11);
//	Map<Integer, Employee> se1=new TreeMap<Integer, Employee>() ;
	
//	System.out.println(se1);
	Set<Entry<Integer,Employee>> eset=map1.entrySet();
	List<Entry<Integer,Employee>> list=new ArrayList<Entry<Integer,Employee>>(eset);
	Collections.sort(list,new ValueComp());
    for(Map.Entry<Integer,Employee> entry:list){

        System.out.println(entry.getKey()+" ==== "+entry.getValue());

    }

	}

	

	 
}

class Department {
	
	Map<Employee,Employee> empMap=new HashMap<Employee, Employee>();

	
	
	public Department(Map<Employee, Employee> empMap) {
		super();
		this.empMap = empMap;
	}

	public Map<Employee, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Employee, Employee> empMap) {
		this.empMap = empMap;
	}
	
}
//implements Comparable<Employee>
class Employee {
	
	String eid;
	String name;
	
	public Employee(String eid,String name){
		this.eid=eid;this.name=name;
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

	
	
	@Override
	public int hashCode() {
	/*	final int prime = 31;
		int result = 1;
		result =  ((eid == null) ? 0 : eid.hashCode());
		return result;*/
	int x= Integer.parseInt(this.eid);
		
		return x;
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
		return " " + eid + "\t" + name + "\n ";
	}
	
	
}

 class IdComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	    int i1=Integer.parseInt(o1.getEid());
	    int i2=Integer.parseInt(o2.getEid());	
	    if(i1>i2)
	    	return 1;
	    else if(i1<i2)
	    	return -1;
	    else
	    	return 0;
//		return o1.getEid().compareTo(o2.getEid());
	}
	 
 }
 
 class NameComp implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
		   return o1.getName().compareTo(o2.getName());
		}
		 
	 }

 class ValueComp implements Comparator<Map.Entry<Integer, Employee>>{

	@Override
	public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
		// TODO Auto-generated method stub
		Employee emp1=o1.getValue();
		Employee emp2=o2.getValue();
		return emp1.getName().compareTo(emp2.getName());
	}
 
 }
 
 class ValueCompId implements Comparator<Map.Entry<Integer, Employee>>{

	@Override
	public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
		// TODO Auto-generated method stub
		Employee emp1=o1.getValue();
		Employee emp2=o2.getValue();
		int id1=Integer.parseInt(emp1.getEid());
		int id2=Integer.parseInt(emp2.getEid());
		
		if(id1>id2)
			return 1;
		else if(id1<id2)
			return -1;
		else return 0;
	}
 
 }