import java.rmi.Naming;
import java.util.Scanner;

public class addclient{
	public static void main(String[] argv) {

		try{
			addinterface add = (addinterface) Naming.lookup("Add..");
			System.out.println("Your answer is "+ add.Addition());
		}
		catch(Exception e){
			System.out.println("AssesmentClient Exception : " + e);
		}
}}