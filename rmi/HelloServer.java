import java.rmi.Naming;
public class HelloServer{
	public static void main(String[] args) {
		try{
			Naming.rebind("Hello",new Hello("Welcome to RMI Program"));
			System.out.println("Server is Connected & ready for operations...🤗🤗🤗🤗🤗🤗");
		}
		catch(Exception e){
			System.out.println("Server is not connected.." + e);
		}
	}
}