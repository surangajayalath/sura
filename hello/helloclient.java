import java.rmi.Naming;
public class helloclient{
	public static void main(String[] args) {
		try{
			hellointerface hello = (hellointerface)Naming.lookup("Hello");
			System.out.println(hello.say());
		}
		catch(Exception e){
			System.out.println("hello client exception:" + e);
		}
	}
}
