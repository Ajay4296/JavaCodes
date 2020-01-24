import java.util.Scanner;
public class SwapNibble {

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int dec=sc.nextInt();
		swapNibble(dec);
		

	}
	public static void toBinary(int n)
	{
		String bin=Integer.toBinaryString(n);
		System.out.println("binary representation:-"+bin);
	}
		
	
	public static void swapNibble(int num)
	{
	int newnum = ((num & 0x0f)<<4|(num & 0xf0)>>4);
	System.out.println("\n before swapping=\n"+num);
	System.out.println("\n After swapping=\n"+newnum);
	toBinary(newnum);

	
	}

}
