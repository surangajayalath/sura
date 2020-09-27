import java.rmi.Naming;

public class AssesmentServer{
	public static void main(String[] argv) {
		try{
			Naming.rebind("doit", new Assesment("Hello, Now Start!"));
			System.out.println("Server is connected are ready to operation!");
		}catch(Exception e){
			System.out.println("Server Not Connected! --->>  " + e);
		}
	}
}