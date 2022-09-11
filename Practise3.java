

class Shop
{
int price;
int discount;
Shop(int price, int discount)
{
this.price=price;
this.discount=discount;
}

public static void main (String args[])
{
Shop prod1= new Shop(300,5);
Shop prod2= new Shop(350,8);
prod1.add_to_cart();
prod2.add_to_cart();
prod1.sell();
prod2.sell();
}
void add_to_cart()
{
System.out.println(price);
System.out.println(discount);
}
void sell()
{
System.out.println("the actual price of the product  is:" + (price-discount));
}


}
