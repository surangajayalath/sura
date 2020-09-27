import java.rmi.*;
import java.rmi.server.*;

public class hello extends UnicastRemoteObject implements
hellointerface{
	private String message;
	public hello(String msg)throws RemoteException{
		message = msg;
	}
	public String say() throws RemoteException{
		return message;
	}
}