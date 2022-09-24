class Lalitha_Thiruvarur extends Lalitha_Chennai
{
int offer;
public Lalitha_Thiruvarur(int offer)
{
this.offer=offer;
//System.out.println("KK Offer" +this.offer);
}

public static void main(String[] args)
{
Lalitha_Thiruvarur lk=new Lalitha_Thiruvarur(2000);
lk.buy();
}
void buy()
{
System.out.println("KK Offer"+ this.offer);
System.out.println("Lc offer"+ super.offer);
}
}
