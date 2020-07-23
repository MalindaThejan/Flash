package mali;
import java.util.Scanner;
public class my1 {
	public static void main(String args[]) {
		 Scanner mali = new Scanner(System.in);
		int a;
		 System.out.println("								Hey visitor!!								");
		 System.out.println("!!!Are you above 10!!! :");
		 a = mali.nextInt();
		 switch(a) {
		 
		 case 1:
		 
			 System.out.println("You can Enter:");
		 
		 break;
		 
		 case 2: 
		 
			 System.out.println("you cannot enter");
		 
		 break;
		 
		 default :
		 
			 System.out.println("Enter valid number!!! (1 or 2)");

		 break;
		 }
	}
}