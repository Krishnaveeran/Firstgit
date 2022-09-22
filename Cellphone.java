package chennai.myhome;

public class Cellphone extends Telephone
{
public static void main(String[] args)
{
Cellphone mobile = new Cellphone();
mobile.make_calls();
mobile.receive_calls();
mobile.send_message();
}
public void send_message()
{
System.out.println("Send SMS");
}
}

