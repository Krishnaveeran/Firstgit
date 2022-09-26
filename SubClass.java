package inherit.staticmethod;
//javac -d . SubClass.java
//java inherit.staticmethod.SubClass
class SubClass extends SuperClass
{
    //Creating static method
    static void Substatemethod()
    {
     System.out.println("In static method of SubClass");
    }
    //Declaring Construction method
    SubClass()
    {
     System.out.println("In SubClass constructor");
    }

   public static void main(String[] args)
    {
SubClass sb = new SubClass();
SubClass.Substatemethod();//without class name also correct
SuperClass.Superstaticmethod();//without class name also running successfully
//SubClass.Substatemethod();
//SuperClass.Superstatmethod();

    }
}
