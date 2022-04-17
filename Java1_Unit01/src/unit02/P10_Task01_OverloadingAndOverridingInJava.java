package unit02;

public class P10_Task01_OverloadingAndOverridingInJava {

	public static void main(String[] args) {
		OverloadingAndOverridingInJava  obj =new OverloadingAndOverridingInJava();
		System.out.println("add() with 2 parents");
		System.out.println(obj.add(4,6));
		
		System.out.println("add() with 3 parents");
		System.out.println(obj.add(4,6,7));
		 InheritanceFirstOne obj2=new  InheritanceFirstOne();
		  System.out.println(obj2.add(1,2,3));
		

	}

}
 
 class OverloadingAndOverridingInJava{
	 
	 //with the same class method overloading
	 int add(int a,int b) {
		 System.out.println("inside overloading in java");
		 return a+b;
	 }
	 int add(int a,int b,int c) {
		 System.out.println("inside overloading in java");
		 return a + b + c ;
	 }
	 }
 //Overriding in java:Required inheritance!
   class  InheritanceFirstOne extends  OverloadingAndOverridingInJava{
	   int add(int a,int b) {
			 System.out.println("inside overloading in java");
			 return a+b+1;
		 }
	   int add(int a,int b,int c) {
			 System.out.println("inside overloading in java");
			 return a + b + c ;
		 }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   