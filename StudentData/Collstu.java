import java.util.Scanner;
class Details{
	float Gpa=0;
	int IdNumber=0;
	Details(){
	}
	Details(int Cd,float Ab){
		Gpa=Ab;
		IdNumber=Cd;
	}
}
class CollegeDetails extends Details{
	int Age =0;
	CollegeDetails(){
	}
	CollegeDetails(int Vb,int Cde,float Abc){
		super(Cde,Abc);
		Age=Vb;
	}
}
public class Collstu{
	public static void main(String args[]){
		System.out.println("Enter the name of the student - ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int Num=0,Gpaa=0,AAge=0;
		System.out.println("Enter the Identification Number - ");
		Num=sc.nextInt();
		System.out.println("Enter the Gpa - ");
		Gpaa=sc.nextInt();
		System.out.println("Enter the Age - ");	
		AAge=sc.nextInt();
		CollegeDetails v2 = new CollegeDetails(AAge,Num,Gpaa);			
		System.out.println("\nName: "+name+"\nIdentification Number: "+v2.IdNumber+"\nGpa: "+v2.Gpa+"\nAge: "+v2.Age);
}
}