package Assignment_1;
import java.util.Scanner;
/*
 Q3:: given an interface In1  which include a method display which takes an integer as  input 
  Interface In1
  {
  void display (int p);
  }
  task is to write a class test class which implement interface In1 and has a method name
   display which takes as integer as an input p and  the display method should be.
 */
public class Q3 {

	public static void main(String[] args) {
testClass obj = new testClass();
		
		Scanner o = new Scanner(System.in);
		int a = o.nextInt();
		
		obj.display(a);

	}

}
interface in1
{
	void display();
}

class testClass
{
	public void display(int p)
	{
		 int i,m=0,flag=0;      
		  m=p/2;      
		  if(p==0||p==1){  
		   System.out.println(p+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(p%i==0){      
		     System.out.println(p+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(p+" is prime number"); }  
		  }
	}
}