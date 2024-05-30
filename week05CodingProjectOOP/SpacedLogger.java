package week05CodingProjectOOP;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String a) {
		System.out.println(addSpaces(a));
	}
	
	@Override
	public void Error(String b) {
		System.out.println("Error: " + addSpaces(b));
	}
	
	//
	//	This method takes a String and returns a StringBuilder
	//	with spaces added between each character.
	
	private StringBuilder addSpaces(String word)
	{
		StringBuilder spacedstring = new StringBuilder();
		for(int i = 0; i < word.length(); i++)
		{
		
			spacedstring.append(word.charAt(i));
			spacedstring.append(' ');
		}
		return spacedstring;
	}
			

}	
	
	

