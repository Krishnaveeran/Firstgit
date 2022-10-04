class Bike9
{
void run()
{
System.out.println("Run");
} 
}
class Honda extends Bike9
{
void run()
{
System.out.println("Print something");
}
public static void main(String[] args)
{
Honda obj = new Honda();
obj.run();
}
}



































