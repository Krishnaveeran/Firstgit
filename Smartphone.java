package chennai.myhome;

public class Smartphone extends Cellphone
{
public static void main (String[] args)
{
Smartphone V25 = new Smartphone();
V25.make_calls();
V25.receive_calls();
V25.send_message();
V25.browse();
}
public void browse()
{
System.out.println("Browse");
}
}
