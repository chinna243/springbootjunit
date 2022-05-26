package com.createiq.fuctionalinterface;

public class Student {
	int id;
	String name;
	double fee;
	public Student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	

}
