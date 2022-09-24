class Lalitha_Kumbakonam extends Lalitha_Chennai
{
int offer;
public Lalitha_Kumbakonam(int offer)
{

this.offer=offer;
System.out.println("kk offer" + this.offer);
System.out.println("Lc Offer" + super.offer);
}
public static void main(String[] args)
{
Lalitha_Kumbakonam lk=new Lalitha_Kumbakonam(2000);
lk.buy();
}
void buy()
{

}

}
