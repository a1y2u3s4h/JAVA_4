package Java1_Unit01;
import java.util.Scanner;
public class P7_switch_statement {
	
public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		Scanner z= new Scanner(System.in);
		int ch;
		System.out.println("enter 1 for current year \n enter 2 for current month\n enter 3 for current day");
		   ch =z.nextInt();
		 
			 switch(ch) {
			 case 1:
				 System.out.println("year is 2022");
				 break;
			 case 2:
				 System.out.println("current month is april");
				  break;
			 case 3 :
				  System.out.println("current day is saturday");
				  break;
			 case 4:
				 System.out.println("not applicable");
				 break;
				 default:
					 break;
			 
			 }
		
	}
}
