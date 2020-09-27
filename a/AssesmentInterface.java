import java.rmi.*;
public interface AssesmentInterface extends Remote{
	public int Addition() throws RemoteException;
	public int Factorial() throws RemoteException;
	public int Power() throws RemoteException;
	public String Prime() throws RemoteException;
}