
public class HelloPart1 {

	public static void main (String[] args)
	{
		 printOne();
		 printTwo();
	}
	
	public static void printOne() {
		System.out.println("Hello Hi");
	}
	
	public static void printTwo() {
		  printOne();
		  printOne();
		
	}
}
