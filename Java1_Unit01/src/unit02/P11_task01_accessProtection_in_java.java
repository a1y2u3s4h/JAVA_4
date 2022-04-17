package unit02;

public class P11_task01_accessProtection_in_java {
             public int a=10;
	public static void main(String[] args) {
		ChildClass obj =new ChildClass();
         obj.showData();
         obj.accessData();
	}

}
class ParentClass{
	int a=10;//default protection!
			public int b=20; //can be accessed outside Unit_01_package but within the same project
			protected int c=20 ;//can only be accessed only in unit 01 package
			private int d=40;//within parent class only,not even in its sub class
			
			void showData() {
				System.out.println("Inside parentclass");
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
				System.out.println("d="+d);
			}
}
class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("inside child class");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//System.out.println("d="+d);// private member can not be accessed outside the class

	}
}
 class AnotherClass{
	 void display() {
		 ParentClass obj=new ParentClass();
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		 System.out.println(obj.c);
	 }
 }