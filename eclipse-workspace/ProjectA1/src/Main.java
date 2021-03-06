
import parser.ParseException;
import parser.ProgramScanner;

public class Main 
{
    public static void main( String[] args )
    { 	boolean success = true;
	    try
	    {
	    	ProgramScanner lScanner = new ProgramScanner( System.in );

	    	System.out.println( "Welcome! " );
	    	System.out.println( "Please create a password. \n Your password must start with an uppercase letter and then contain at least one lowercase letter and at least one number. \n Only the first character can be an uppercase letter and only numbers and letters are allowed.");

			System.out.println( "Please write a password: " );	  
	    	
	    	lScanner.Scan();
		
	    	System.out.println( "You have successfully created a password!" );
	    }
	    catch (Exception e)
	    {
	    	System.out.println( "\n The password does not meet all requirements. " );

	    	success = false;
	    }
	    if (success == false)
	    {
	    	try
		    {
		    	ProgramScanner lScanner = new ProgramScanner( System.in );

		    	System.out.println( "You have only one more chance to create a password. \n Try again..." );
		    	System.out.println( "Please write a password: " );  
		    	
		    	lScanner.Scan();
			
		    	System.out.println( "You have successfully created a password!" );
		    }
		    catch (Exception e)
		    {
		    	System.out.println( "The password does not meet all requirements. \n All chances used up." );
		    }
	    }

    }
}
