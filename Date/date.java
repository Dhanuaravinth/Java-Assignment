import java.util.*; 
public class date {
	public date(int a) {
		
	}
	int day(int b) {
		
		return b;
		
	}
	int month(int c) {
		
		return c;
	}
	int year(int d) {
		
		return d;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter Day - ");  
		int a= sc.nextInt();  
		System.out.print("Enter Month - ");  
		int b= sc.nextInt();  
		System.out.print("Enter Year - ");  
		int c= sc.nextInt();    
		System.out.println("mm/dd/yyyy - " +b+"/"+a+"/"+c);  	
		System.out.println("Happy birthday dhanu");

	}

}
