import java.util.Scanner;
public class ReplaceName {

	public static void main(String[] args) {
		System.out.println("enter your first name");
		Scanner input = new Scanner(System.in);
		String fname =input.nextLine();
		if(fname.length()>3)
		System.out.println("hello"+" "+fname);
		else {
			System.out.println("Name should be greater than three later");
         System.exit(0);}
		System.out.println("hello"+" "+fname+" "+"How are you");
			 
			
		
		

	}

}
