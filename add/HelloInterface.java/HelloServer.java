import java.rmi.Naming;

public class HelloServer{
public static void main(String[] args) {
	
	try{
		Naming.rebind("Hello",new Hello("Welcome to rmi😳"));
		System.out.println("Server is connected & ready for operation........😐");
	}
	catch(Exception e){
		System.out.println("Server not connected....🤗" + e);
	}

	}
}