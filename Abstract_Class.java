public class Abstract_Class
{
int x=10;
Abstract_Class()
{
System.out.println("Constructor of Abstract class");
}
void method1()
{
System.out.println("Instance method of Abstract class");
}
static void method2()
{
System.out.println("Static Method of Abstract class");
}
abstract void method3();
}
class Non_Abstract_Class extends Abstract_Class
{
Non_Abstract_Class()
{
System.out.println("Constructor of Non abstract class");
}
void method3()
{
System.out.println("This is abstract method. Method body defined in Non abstract class");
}
public static void main(String[] args)
{
Non_Abstract_Class na= new Non_Abstract_Class();
na.method3();
na.method1();
method2();
Abstract_Class.method2();
}

}
