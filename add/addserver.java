import java.rmi.Naming;

public class addserver{
	public static void main(String[] argv) {
		try{
			Naming.rebind("doit", new add("Hello, Now Start!"));
			System.out.println("Server is connected are ready to operation!");
		}catch(Exception e){
			System.out.println("Server Not Connected! --->>  " + e);
		}
	}
}