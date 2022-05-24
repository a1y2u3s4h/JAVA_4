package Exception_Handling;

public class asdd {
	int a=100/0;
	if(a>10) {
		throw new Exception;
		  
	}
}
	/*int a=150/0;
	sysout(a);
	catch(ArthmeticException) {
		System.out.println("something went wrong");
	}/*
	 if there is exception then finally always run
	 if it is catch then finally would run if not then does not run
     if an exception bypasses the process and break at run time then it is called runtime exception
		
			
	
	
}
void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}

}
P15_FileHandling.java
1- obj.takeInputFromAFileNotFromConsole(){}
2- obj.saveOutputIntoAFile(){}
3- obj.createALogFile(){}

