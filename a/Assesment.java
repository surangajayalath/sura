import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Assesment extends UnicastRemoteObject implements AssesmentInterface{
	public Scanner sn = new Scanner(System.in);
	public Assesment(String msg) throws RemoteException{
		System.out.println(msg);
	}
	public int Addition() throws RemoteException{
		System.out.println("Enter 2 Numbers for Addition :");
		int num1 = sn.nextInt();
		int num2 = sn.nextInt();
		int anser = num2+num1;
		return anser;
	}
	public int Factorial() throws RemoteException{
		System.out.println("Enter Your Facorial Number :");
		int fac = sn.nextInt();
		int tot = 1;
		for (int i = 1; i <= fac ; i++ ) {
			tot = tot*i;
		}
		return tot;

	}
	public int Power() throws RemoteException{
		System.out.println("Enter the Base Number :");
		int bn = sn.nextInt();
		System.out.println("Enter the exponent Number :");
		int expo = sn.nextInt();
		int tot = bn;
		for (int x = 1; x < expo ; x++) {
			tot = tot * bn;
		}
		return tot;
	}
	public String Prime() throws RemoteException{
		System.out.print("Enter the number : ");
		int i,m=0,flag=0;    
  		int n=sn.nextInt(); 
  		m=n/2;    
  		if(n==0||n==1){
   			return "It's not prime number!";    
  		}else{
   			for(i=2;i<=m;i++){    
    			if(n%i==0){     
     				flag=1;   
     				return "I'is not prime number!";        
    			}    
   			}    
   			if(flag==0){
   				return "It's prime number!";
   			}
  		}
  		return " ";
	}


}
