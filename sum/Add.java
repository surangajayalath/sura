import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

 public class Add extends UnicastRemoteObject implements

 AddInterface{
   public Scanner sn = new Scanner(System.in);
   public Add(String msg)throws RemoteException{
     System.out.println(msg);
   }
   public int ADD() throws RemoteException{
     System.out.println("Enter First Number: ");
     int num1 = sn.nextInt();
     System.out.println("Enter Second Number: ");
     int num2 = sn.nextInt();
     int ans = num1 + num2;

     return ans;
   }
 }
