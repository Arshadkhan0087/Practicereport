package com.miit;

public class EmployeeData {
	
		int age;
		String name;
		String address;
		
		 public EmployeeData(int age,String name,String address){
			 this.age=age;
			 this.name=name;
			 this.address=address;
		 }
		 public static void main(String args[]) {
			 
		 
		 EmployeeData obj1=new EmployeeData(30,"Ashu","Can");
		 EmployeeData obj2=new EmployeeData(40,"Arsh","USA");
		 EmployeeData obj3=new EmployeeData(35,"Mike","UK");
		 System.out.println(obj1.age);
		 System.out.println(obj2.name);
		 System.out.println(obj3.address);
		 
	}
}

