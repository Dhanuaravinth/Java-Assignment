package Library;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
class InvalidbookException extends Exception
{
    public InvalidbookException(String s)
    {
        super(s);
    }
}
public class Library
{
	static DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
	static String dateString2 = dateFormat2.format(new Date()).toString();  
	String str3="Genius";
   void bookCheck(String count1) throws InvalidbookException{
	if(count1==str3){
                 System.out.println("the book is in 3rd room second rack and the book is not allowed to take to your home");
         }
          else{
		throw new InvalidbookException("book is not there in the library the book will be soon in a week");
	}
   }
   
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	Library obj = new Library();
    	while(true) {
    	System.out.println("\nWelcome to Library");
		System.out.println("\n  Login");
		System.out.println("Username : ");
		String username = s.nextLine();
		System.out.println("Password : ");
		String password = s.nextLine();
    	
        if(username.equals("18BEE080") && password.equals("18bee080_123"))
        {
        	System.out.println("Authentication Successful!!!");
            System.out.println("\nStocks in Library");
            System.out.println("Search for Books");
            
            String str1;
            int count=1;
            str1=s.nextLine();
            
        try
        {
            if(str1.equals("Genius")){
            System.out.println("The book is in second rack");
            obj.bookCheck("Genius");
            System.out.println("Book Issue at "+dateString2);
            }
            else if(count==1){
                 System.out.println("Out of Stock");
                 obj.bookCheck(str1);
            }
        }
        catch (InvalidbookException ex)
        {
            System.out.println("The book status:");
            System.out.println(ex.getMessage());
        }}
        else
        {
            System.out.println("Authentication Failed!!!\nTry Again");
        }
    }
    }
	
}
