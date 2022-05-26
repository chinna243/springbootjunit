package com.createiq.methodrefernce.demo2;

public class Employee {
	int eid;
	String enme;
	
//	public Employee() {
//		System.out.println("defalut Constrctor");
//	}


	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the enme
	 */
	public String getEnme() {
		return enme;
	}

	/**
	 * @param enme the enme to set
	 */
	public void setEnme(String enme) {
		this.enme = enme;
	}

	public Employee(int eid, String enme) {
		super();
		this.eid = eid;
		this.enme = enme;
		System.out.println(eid);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enme=" + enme + "]";
	}
	

}
