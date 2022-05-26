package com.createiq.methodrefernce;

public class Test {
	public static void main(String[] args) {
//		Caculator cal=(num1,num2)->num1+num2;
//		int sum=cal.sum(12, 30);
//		System.out.println("sum:"+sum);
	IDemo iDemo= ()->  new Employee();
	IDemo i2=Employee::new;
		IDemonext demonext=(id,name, salary)->new Employee(id, name, salary);
	IDemonext iDemonext=Employee::new;
		
Employee emonext=iDemonext.getEmployee(10,"murali",2000.00);
System.out.println(emonext);
       

	}

}


 