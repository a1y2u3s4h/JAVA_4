package unit02;

/*
  
 -extends keywords
 -sub class
 -super class
 "code Re-usability"
 class derived-class-name"extends"base-class
 {
 //methods and field
 }
 Types of inheritance :
  -single inheritance
  -multilevel inheritance
  -" multiple inheritance:"Java does not support multiple inheritance with classes
    - it handles this feature  by implementing more then one interface instead of extending more than one class
    
    -hierarchical inheritance(tree)?:yes!
    -hybrid inheritance?no!
    -constructor calls flow in inheritance!
    -default constructor
    - parameterized constructor
 */
public class P08_Task01_InheritanceInJava {
	public static void main(String[] args) {
		Three g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodOne();
		g.methodThree();

		Two two = new Two(1);
		D obj = new D(2);
		obj.methodFour();
	}

}

class One {
	int a;
   int b;
	One(int x ) {
		System.out.println("one constructor 321!");
		System.out.println(x);
	
	}

	public void methodOne() {
		System.out.println("first method");
	}
}

class Two extends One {
	int b;

	Two(int x) {
		super(3);
		b = x;
		System.out.println("two");
	}

	public void methodTwo() {
		System.out.println("second method");
	}
}

class Three extends Two {
	int c;

	Three() {
		super(1);
		System.out.println("three constructor!");
	}

	Three(int x) {
		super(1);
		c = x;
		System.out.println("Three");
	}

	public void methodThree() {
		System.out.println(("SecondMethod"));
	}
}

class A {
	int a;

	A(int a1) {
		a = a1;
	}

	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	B(int x) {
		super(10);
		b = x;
	}

	}

	public void methodTwo() {
		System.out.println(b);
	}
}

class C extends A {
	int c;

	C() {
		super(10);
		c = 10;
	}

	public void methodThree() {
		System.out.println(c);
	}
}

class D extends A {
	int d;

	D(int d1) {
		super(d1);
		d = d1;
	}

	public void methodFour() {
		System.out.println(d);
	}
}
