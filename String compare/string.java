import java.util.Scanner;
public class string {
public static void main(String[] args)
    {
	Scanner s = new Scanner(System.in);
	System.out.println("String 1 : ");
	String str1 = s.nextLine();
	System.out.println("String 2 : ");
	String str2 = s.nextLine();
    System.out.println("String 1: " + str1);
    System.out.println("String 2: " + str2); 
    int result = str1.compareToIgnoreCase(str2);
    if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else 
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}
