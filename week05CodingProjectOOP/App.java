package week05CodingProjectOOP;

public class App {

	public static void main(String[] args ) {
		String word = "Hello"; 
		
		Logger asteriskLog = new AsteriskLogger();
		System.out.println("Asterisk Logger:");
		asteriskLog.Log(word);
		asteriskLog.Error(word);
		
		Logger spacedLog = new SpacedLogger();
		System.out.println("\nSpaced Logger: ");
		spacedLog.Log(word);
		spacedLog.Error(word);
	
	}
}	
	
	

