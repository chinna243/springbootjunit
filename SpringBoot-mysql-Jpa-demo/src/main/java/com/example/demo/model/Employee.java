package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
//@NamedQuery(name = "Employee.findByEname", query = "select u from Employee u where u.ename = ?2")
@NamedQueries(value = {
		@NamedQuery(name = "Employee.findByEname", query = "select u from Employee u where u.ename =:ename"),
		  @NamedQuery(name = "Employee.findByEsal", query = "select u from Employee u where u.esal =:esal") })
public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private double esal;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
