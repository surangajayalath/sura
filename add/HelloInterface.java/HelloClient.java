import java.rmi.Naming;
public class HelloClient{
	public static void main(String[] args) {
		try{
		HelloInterface hello = (HelloInterface)Naming.lookup("Hello");
		System.out.println(hello.tellme());
	}
	catch(Exception e){
		System.out.println("HelloClient Exception" + e);
	}
}
}