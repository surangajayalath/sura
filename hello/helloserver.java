import java.rmi.Naming;
public class helloserver
{
	public static void main(String[] argv){
		try{
			Naming.rebind("Hello",new hello ("M Suranga Jayalath\nSEU/IS/16/ICT/018"));
			System.out.println("Server is connected and ready for operation......");

		}
		catch(Exception e){
			System.out.println("Server not connected:" + e);
		}
	}
}