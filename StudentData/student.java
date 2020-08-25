class student
{
   private int stuID;
   private String stuName;
   private int stuAge;
private int stuGPA;   
student()
   {
       //Default constructor
       stuID = 80;
       stuName = "Dhanu";
       stuAge = 20;
       stuGPA=9;
   }
   student(int num1, String str, int num2,int num3)
   {
       //Parameterized constructor
       stuID = num1;
       stuName = str;
       stuAge = num2;
       stuGPA= num3;   
}
   //Getter and setter methods
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   public String getStuName() {
       return stuName;
   }
   public void setStuName(String stuName) {
       this.stuName = stuName;
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }

public int getStuGPA() {
       return stuGPA;
   }
   public void setStuGPA(int stuGPA) {
       this.stuGPA = stuGPA;
   }
   public static void main(String args[])
   {
       //This object creation would call the default constructor
       student myobj = new student();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());
       System.out.println("Student GPA is: "+myobj.getStuGPA());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       student myobj2 = new student(78, "Padmanaban", 25,10);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
System.out.println("Student GPA is: "+myobj.getStuGPA());
  }
}