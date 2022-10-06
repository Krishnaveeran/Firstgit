class Bank2{
private int minBalance=1000;

public int getMinBalance()
{
return this.minBalance;
}
public void setMinBalance(int value)
{
if(value>1000)
this.minBalance=value;
}
}
