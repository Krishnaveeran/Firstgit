class Sbi{
public static void main(String[] args)
{
Bank bb=new Bank();

int min=bb.getMinBalance(); //getter method calling
System.out.println(min);

bb.setMinBalance(2000); //Setter Method calling

int min1=bb.getMinBalance();
System.out.println(min1);
}
}
