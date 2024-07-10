package projects.exception;

public class DbException extends RuntimeException {
	
	public DbException() {

	}	
	
	public DbException(String message) {
		
	}
	
	public DbException(Throwable cause) {
		super(cause);
		
	}	
	
	
	public DbException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	
}
