package com.ca2;

public class Student extends Demo {
  private int rollno;
  private String name;
  private String address;
  private int marks;
  
  public static void main(String[] args) {
Student s1=new Student();

System.out.println(s1);
//System.out.println(s1.name);
//System.out.println(s1.address);
//System.out.println(s1.marks);
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
}
}
