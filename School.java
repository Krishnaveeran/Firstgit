class School //class can't be private
{
private void recruit()
{
System.out.println("Manage activity");
}
public static void main (String [] args)
{
//School teacher=new School(); // We can give this hereitself instead of giving another class
//teacher.recruit(); //

School sslc_student=new School();
sslc_student.calculate(90,95,98,100,87);
School hsc_student=new School();
hsc_student.calculate(90,87,98,96,95,94);
hsc_student.calculate(87,98,96,95,94,"Krishna");
}
void calculate(int m1,int m2,int m3,int m4,int m5,String name)
{
System.out.println(m1+m2+m3+m4+m5);
System.out.println(name);
}
void calculate(float m1,int m2,int m3,int m4,int m5,int m6)
{
System.out.println(m1+m2+m3+m4+m5+m6);
}
void calculate(int m1,int m2,int m3,int m4,int m5)
{
System.out.println(m1+m2+m3+m4+m5);
}
}
