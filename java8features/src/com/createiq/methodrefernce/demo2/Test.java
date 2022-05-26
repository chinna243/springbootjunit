package com.createiq.methodrefernce.demo2;

public class Test {
	public static void main(String[] args) {
//		Addition addition=new Addition() {
//			
//			@Override
//			public void add(int a, int b) {
//				System.out.println(a+b);
//				
//			}
//		};
//		addition.add(0, 0);
		

//		Addition addition=(x,y)->System.out.println(x+y);
//		addition.add(0, 1);
//		SumOf sumOf=new SumOf();
//		
//		Addition addition=sumOf::sum;
//		addition.add(0, 0);
		
//		Employee employee=new Employee();
//		Addition addition=Employee::new;
//		addition.add();
//		Employee employee=new Employee(100, "a");
//		System.out.println(employee);
//		
		
		Addition addition=(eid,ename)->new Employee(eid,ename);
				
				
		
		Addition addition2=Employee::new;
	Employee  employee=addition2.getEmployee(10, "mohan");
	System.out.println(employee);
		
		
		
	
		
		
}

	
}