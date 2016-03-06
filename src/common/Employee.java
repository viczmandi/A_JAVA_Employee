/*Create a java class Employee. Add instance members to it to store name, age, salary. 
Create getter / setter to them. Add class level member to it to store the retiring age. 
It is 65 by default. Initializes the instance tags in the constructor. 
Implement a method getLeftYearsToRetiring to get the year left to retiring.
Add a method that returns all parameter in a well formed string. Named getEmployeeInfo. 
Add a method to set the retiring age.
Add a method to compare two Employee instances which one has greater salary. 
This is class level method.*/

package common;

public class Employee {
	private String name;
	private int age;
	private int salary;
	
	private static int retiringAge = 65;
	
	public static int getRetiringAge() {
		return retiringAge;
	}
	public static void setRetiringAge(int retiringAge) {
		Employee.retiringAge = retiringAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void getLeftYearsToRetiring(){
		System.out.println("Year left to retiring: " + (retiringAge - this.age));
	}
	public String getEmployeeInfo(){
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(this.name);
		sb.append(",Age: ");
		sb.append(this.age);
		sb.append(",Salary: ");
		sb.append(this.salary);
		return sb.toString();
	}
	public static void compareEmployee(Employee one, Employee two){
		if (one.salary > two.salary) {
			System.out.println(one + "has greater salary.");
		} else {
			System.out.println(two + "has greater salary.");
		}
	}
}
