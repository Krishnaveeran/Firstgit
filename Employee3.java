class Employee3 extends Parent2 implements Employees
{ // Multiple Inheritance
public static void main(String[] args)
{
Employee3 e3 = new Employee3(); 
System.out.println(e3.holidays); 
System.out.println(Employee3.holidays);
System.out.println(Employees.holidays);

}
public void work(){}

public void sign(){} 

public void getSalary(){}

public void fillTimeShift(){}

}
