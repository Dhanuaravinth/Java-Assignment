import java.util.Scanner;
	class Timee{
		int X,Y,Z;
		int B;	
		Timee(){
		}
		Timee(int I,int J,int K){
			X=I;	
			Y=J;
			Z=K;
		}
		Timee(int G){
			B=G;
		}
	}
	public class DayTime{
		
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int count=0;
			int hr=0,min=0,sec=0;
			while(count==0){
				System.out.println("Enter the Hour-");
				hr=sc.nextInt();
				System.out.println("Enter the Minutes-");
				min=sc.nextInt();
				System.out.println("Enter the Seconds-");
				sec=sc.nextInt();
				if((hr<24)&(hr>-1)&(min>-1)&(min<60)&(sec>-1)&(sec<60)){
					count=1;
				}
				else{
					System.out.println("The Entered numbers are not in range.\nEnter the Hours between 0 to 23 and  Minutes between 0 to 59 and Seconds between 0 to 59");
				}
			}
			Timee t1=new Timee(hr,min,sec);
			int Abc=(60*60*hr)+(60*min)+sec;
			Timee t2=new Timee(Abc);
			System.out.println("Time: "+t1.X+":"+t1.Y+":"+t1.Z);
			System.out.println("Time in seconds:"+t2.B);
		}
	}