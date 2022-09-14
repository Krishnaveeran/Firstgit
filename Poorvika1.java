class Poorvika1
{
int price, discount; 
String model; 
Poorvika1()
{
System.out.println("Juice"); 
}
Poorvika1(String model, int price)
{
this(); 
this.model = model; 
this.price = price; 
System.out.println("Calendar "+ this.model); 
}
Poorvika1(String model, int price, int discount)
{
 this(model, price); // first statement 
this.model = model ; 
this.price = price; 
this.discount = discount; 
System.out.println("Gift Voucher for "+ this.model);


}
public static void main(String[] args)
{
Poorvika1 nokia = new Poorvika1("Nokia 1100", 10000);
Poorvika1 apple = new Poorvika1("Apple 14 Pro Max", 100000, 10000); 
Poorvika1 samsung = new Poorvika1("S22 Ultra ", 5000, 500); 
System.out.println("Discount of samsung mobile is: " +samsung.discount); 
System.out.println("Price of nokia is: " +nokia.price); 

}
}
