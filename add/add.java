import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class add extends UnicastRemoteObject implements 

addinterface{
	public Scanner sn = new Scanner(System.in);
	public add(String msg)throws RemoteException{
		System.out.println(msg);
	}
	public int Addition() throws RemoteException{
		System.out.println("Enter two number for Calculations...");
		int num1 = sn.nextInt();
		int num2 = sn.nextInt();
		int answer = num1 + num2;
		return answer;
	}
}











