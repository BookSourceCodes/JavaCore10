
/**
 * This program demonstrates parameter passing in Java.
 * @version 1.00 2000-01-27
 * @author Cay Horstmann
 */

/*
下面总结一下Java中方法参数的使用情况：
	1）一个方法不能修改一个基本数据类型的参数（即数值型或布尔型）
	2）一个方法可以改变一个对象参数的状态。
	3） 一个方法不能让对象参数引用一个新的对象
 */
public class ParamTest {

	public static void main(String[] args) {
		/*
		 * Test 1: Methods can't modify numberic parameters
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);
		
		/*
		 * Test 2: Methods can change the state of object parameters
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harray", 50000);
		System.out.println("Before: salary=" + harry.getSalary());tripleSalary(harry);
		tripleSalary(harry);
		
		/*
		 * Test 3:Methods can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}
	
	public static void tripleValue(double x) {	// doesn't work
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}
	
	public static void tripleSalary(Employee x) {	// works
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
}


class Employee {	// simplified Employee class
	
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}