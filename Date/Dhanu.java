import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Dhanu {
   public static Date StringToDate(String dob) throws ParseException {
      //Instantiating the SimpleDateFormat class
      SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
      //Parsing the given String to Date object
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("Enter your date of birth (DD-MM-YYYY): ");
      String dob = sc.next();
      Date date = Dhanu.StringToDate(dob);
      System.out.println("Select format: ");
      System.out.println("a: MM/DD/YYYY || b: YYYY-MM-DD ");
      char ch = sc.next().toCharArray()[0];
      switch (ch) {
         case 'a':
            System.out.println("Date in the format: MM/DD/YYYY");
            System.out.println(new SimpleDateFormat("mm/dd/yyyy").format(date));
            break;
         case 'b':
            System.out.println("Date in the format: YYYY-MM-DD");
            System.out.println(new SimpleDateFormat("yyyy-mm-dd").format(date));
            break;
        
            default:
            System.out.println("Model not found");
            break;
      } System.out.println("Happy Birthday"+" "+name);
   }
}