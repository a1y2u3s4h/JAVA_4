package unit02;
//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
/*
  -A java package  is a similar type of classes ,inheritance and sub package
  -built in package(lang,awt, javax ,swing,net,io, util, sql)
  -user defined package
  
   -package also help to avoid class name collision
   -package also help us to maintain access protection in java
   -package are named in reverse order of domain names
   -unit01.javaproject.com->"com.javproject.unito1"
   
   import java.util.vector;//import the vector class from vector package
   import.java.util.*;//import all the classes from util package
   static imports;
   -static import is the feature introduced in java programming language{version 5 and above}
   -that allows members(fields and methods)defined in class as public static,to be used in java code without specifying the
   ,class in which the field is defined
 */
 import static java.lang.System.*;
 import static java.lang.Math.*;
  //import Java_Unit01. SampleClass1;
public class P11_Task02_ImportingAndPackageinJava {

	public static void main(String[] args) {
		out.println("welcomr to package");
		  out.println(sqrt(4));
		  System.out.println(pow(2,2));
		  System.out.println(abs(6.3));
		//  SampleClass1 obj =new Sampleclass1();
		  //System.out.println(obj.a);

	}

}
