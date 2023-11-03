package com.practice.string.questions;

import java.util.ArrayList;

public class PrintEmployeeDetailsWithSimilarDepartment {
     public static void main(String[] args) {
    	 Employee e1=new Employee(1,"arun","9785848483","physics");
         Employee e2=new Employee(2,"nora","9754848483","chemistry");
         Employee e3=new Employee(3,"deepak","45848483","biology");
         Employee e4=new Employee(4,"preeti","8655839898","physics");
         Employee e5=new Employee(5,"monika","97445663","physics");
         ArrayList<Employee> list=new ArrayList<>();
         list.add(e1);
         list.add(e2);list.add(e3);list.add(e4);list.add(e5);
         list.stream().filter(e->e.getDepartment().equals("physics")).forEach(s->{
        	 System.out.println("employer id: "+ s.getId());
        	 System.out.println("employer name: "+ s.getName());
        	 System.out.println("employer phone: "+ s.getPhone());
        	 System.out.println("department: "+ s.getDepartment());
        	 System.out.println();
         });
	}

}
class Employee{
	private int id;
	private String name;
	private String phone;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int id, String name, String phone, String department) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.department = department;
	}
}