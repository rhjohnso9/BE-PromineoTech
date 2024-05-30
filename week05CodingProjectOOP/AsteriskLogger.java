package week05CodingProjectOOP;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String a) {
		System.out.println("***" + a +"***");
	}

	@Override
	public void Error(String b) {
		boxOfAsterisk(b);
	}
	
	//This method takes a string and prints out two lines of asterisks forming
	// a box around the "Error: " message 
		
	private void boxOfAsterisk(String word) {
		String border = "******************"; 
		System.out.println(border);
		System.out.println("***Error: " + word + "***"); 
		System.out.println(border);
		
	
		
	}

		
}	

	
	

