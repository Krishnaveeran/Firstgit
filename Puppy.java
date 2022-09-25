class Animal{
void eat()
{
System.out.println("Eating");
}
}
class Dog extends animal{
void eat()
{
System.out.println("Dog will eat solid & liquid food");
}
}
class Puppy extends Dog{
void eat()
{
System.out.println("Puppy will drink milk only");
}
public static void main(String[] args)
{
Animal obj1=new Animal();
obj1.eat();
Dog obj2=new Dog();
obj2.eat();
Puppy obj3=new Puppy();
obj3.eat();
}
}



