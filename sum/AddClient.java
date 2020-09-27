import java.rmi.Naming;
import java.util.Scanner;
public class AddClient{
	public static void main(String[] argv) {
    try{
      AddInterface add = (AddInterface) Naming.lookup("doit");
      System.out.println("Answer is: " +add.ADD());
    }
    catch(Exception e){
			System.out.println("AddClient Exception : " + e);
		}
  }
}
