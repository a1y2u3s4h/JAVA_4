package unit_3;

public class P14_ExceptionalHandlingInJava {

	public static void main(String[] args) {
		   ABCD obj=new ABCD();
		 obj.basicException();// {/ by zero}
		 obj.handleException(); //{use of try and catch}
		 obj.multipleCatch(); //{multiple catch for one try block}
		 obj.inputMismatchException();// {nextInt() and enter string}
		 obj.stackOverFlowError(); //{unstoppable recursion}
		 obj.indexOutOfBoundException();// {a[10] in a[3] array}
		 obj.nullPointerException() ;//{s.lenght() when s is null}
		 obj.useOfThrow() ;//{manually throw exception}
		 obj.useOfThrows&finalize();
	}

}

class ABCD{
	    void basicException();
	    void  handleException();
	    void multipleCatch(); 
	    void inputMismatchException();
	    void stackOverFlowError();
	    void indexOutOfBoundException();
	    void nullPointerException();
	    void useOfThrow();
	    void useOfThrows&Finally();
	    
	    
	    
	    
}