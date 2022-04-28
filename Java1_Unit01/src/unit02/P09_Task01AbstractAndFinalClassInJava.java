package unit02;
/*
  Abstract Class
  -An Abstract class must be declared with the abstract keyward.
  
  -Abstraction is the process of hiding the implementation detail
  and showing inly functionality(function declaration) to the user.
  -Can't make the object of abstract class directly ,but throuogh the derived class [cannot be instant]
  
  FInal Class
  -The main purpose of using a class being declared as final is to prevent the class from being inherited
  -if a class is marked as final then no class is inherit any feature from the final class.
  -you cann't extend the final class .If you try ,it gives you compile time error.
 */


abstract class bike{
int a;
 bike()
 {
	 System.out.println("inside bike constructor:"+a+"\n");
 }
 abstract void run();//abstract method(0-100%)
   void display() {
	   System.out.println("the is display method!");
   }
}
 
 class honda extends bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 public class P09_Task01AbstractAndFinalClassInJava {
	 public static void main(String[] args) {
		 bike obj=new honda();
		 //obj.run();
		 obj.display();
		 //can not be instantiated
		 //bike obj2=new bike
	 }
 }
 
 //Final class
  final class Super{
	  public int data=30;
	  void display() {
		  System.out.println(data);
	  }
  }
 /*
    public class sub extends Super{
    void display2(){
    display();
    }
    }
    
  */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 