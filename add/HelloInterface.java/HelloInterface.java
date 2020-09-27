import java.rmi.*;

public interface HelloInterface extends Remote{
	public String tellme() throws RemoteException;
}