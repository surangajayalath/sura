import java.rmi.Naming;
import java.util.Scanner;

public class AssesmentClient{
	public static void main(String[] argv) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		System.out.println("\t 1 >> Addition of Two Numbers!");
		System.out.println("\t 2 >> Finding the Factoril of a Number!");
		System.out.println("\t 3 >> Finding The Power of a number!");
		System.out.println("\t 4 >> Check Number is Prime or Not!");
		System.out.print("Choise is : ");
		int choice = sn.nextInt();

		try{
			AssesmentInterface ai = (AssesmentInterface) Naming.lookup("doit");
			switch(choice){
				case 1:
					System.out.println("Your Anser is : " + ai.Addition());
					break;
				case 2:
					System.out.println("Your Anser is : " + ai.Factorial());
					break;
				case 3:
					System.out.println("Your Anser is : " + ai.Power());
					break;
				case 4:
					System.out.println("Your Anser is : " + ai.Prime());
					break;
				default:
					System.out.println("Invalied Input!");
					break;
			}
		}catch(Exception e){
			System.out.println("AssesmentClient Exception : " + e);
		}
		
	}

}