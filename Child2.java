
class Child2 extends Parent2
{
public static void main(String[] args)
{
Child2 ch = new Parent2();
//Parent2 pa= new Parent2();
//pa.work(); 
ch.eat(); 
ch.watch();
ch.read();  
//ch.work(); 
}
void work()
{
System.out.println("Software Engineer");
}
void eat()
{
System.out.println("South North Dishes");
}
void watch()
{
System.out.println("Smart TV Watching");
}
}
