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
}
class Test{
public static void main(String[] args)
{
Animal Ani=new Animal();
Ani.eat();
Dog dg=new Dog();
dg.eat();
Puppy obj=new Puppy();
obj.eat();
}
}


