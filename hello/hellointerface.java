import java.rmi.*;
public interface hellointerface extends Remote{
	public String say() throws RemoteException;
	
}