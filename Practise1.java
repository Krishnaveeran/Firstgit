import java.io.*;
class practise1
{
static int num=100;
static string str="Geeks for Geeks";

static void display()
{
System.out.println("static number is:" + num);
System.out.println("static string is:"  +str)
}
void nonstatic()
{

display();
}

public static void main (String args[])
{
practise1 obj=new practise1();
obj.nonstatic;
display();
}

