    public class Practise2 
    {  
    int s;  

    public static void main(String [] args)  
    {  
    //Creating an object of the class  
    Practise2 obj = new Practise2();  
    //invoking instance method   
    System.out.println("The sum is: "+obj.add(12, 13));  
    }  

    public int add(int a, int b)  
    {  
    s = a+b;   
    return s;  
    }  
    }  

