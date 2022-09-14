class Poorvika
{
int price, discount; 
Poorvika()
{
System.out.println("Juice"); 
}
Poorvika(int price)
{
this(); 
this.price = price; 
System.out.println("Calendar"); 
}
Poorvika(int price, int discount)
{
this(price);  //it is first statement in any constructor
this.price = price; 
this.discount = discount; 
System.out.println("Gift Voucher"); 
}
public static void main(String[] args)
{
Poorvika nokia = new Poorvika(1000);
Poorvika apple = new Poorvika(100000, 10000); 
Poorvika samsung = new Poorvika(5000, 500); 
System.out.println(samsung.discount); 
System.out.println(nokia.price); 
}
}




