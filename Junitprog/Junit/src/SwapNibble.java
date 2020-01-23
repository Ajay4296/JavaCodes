import java.util.Scanner;
public class SwapNibble {

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int dec=sc.nextInt();
		toBinary(dec);
		

	}
	public static void toBinary(int n)
	{
		String bin=Integer.toBinaryString(n);
		System.out.println("binary representation:-"+bin);
		
		
	}

}
