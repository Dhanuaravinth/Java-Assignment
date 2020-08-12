class Bag{  
int getversion()
{  return 0;  }  
}  
  
class Microcontrollers extends Bag{  
int getversion()
{return 8;}  
}  

class Pcb extends Bag{  
int getversion(){return 7;}  
}  
class Internetofthings extends Bag{  
int getversion(){return 9;}  
}  
  
class Book{  
public static void main(String[] args){  
	Microcontrollers m=new Microcontrollers();  
	Pcb p=new Pcb();  
	Internetofthings i=new Internetofthings();  
System.out.println("Microcontrollers Book Version: "+m.getversion());  
System.out.println("Pcb Book Version: "+p.getversion());  
System.out.println("Internetofthings Book Version: "+i.getversion());  
}  
}  