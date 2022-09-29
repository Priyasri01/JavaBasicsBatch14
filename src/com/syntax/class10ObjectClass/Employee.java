package com.syntax.class10ObjectClass;

public class Employee {
	
	int empid;
	String empNam;
	int salary;
	int deptNo;
	
	/*Employee(int id, String name, int sal,int dno){ // this is a consturtor Method

 		empid=id;
	 	empNam=name;
		salary =sal;
 		deptNo=dno;
		
//	} */
	
	
	void display() // note method may return the value and method will not return any value.
	
	{
		System.out.println(empid);
		System.out.println(empNam);
		System.out.println(salary);
		System.out.println(deptNo);
	}
	
	public static void main(String[] args) {
		
		//Assigning values to class variables  using object -first method
		Employee emp1= new Employee(); // created object "emp1"  for class employee
		
		emp1.empid=101;
		emp1.empNam="Priya";
		emp1.salary=200000;
		emp1.deptNo=10;
		emp1.display();
		
		Employee emp2= new Employee();
		emp2.empid=102;
		emp2.empNam="Raju";
		emp2.salary=300000;
		emp2.deptNo=20;
		emp2.display();
		
		//Assigning values  to class varibale using constructors.
		
		/*Employee emp1= new Employee(101,"raj", 200000, 10);
		 * emp1.display();
		 * 
		 */
		
	}
	
		


}
