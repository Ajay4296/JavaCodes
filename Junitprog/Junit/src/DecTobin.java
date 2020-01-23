import java.util.Scanner;
public class DecTobin {

	public static void main(String[] args)
	{
		System.out.println("enter decimal value");
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
		binary(dec);

	}
	public static void binary(int dec)
	{ 
		String bin=" ";
		while(dec>0)
		{
		
		bin=bin+dec%2;
		dec=dec/2;		
		}
		StringBuilder sb=new StringBuilder(bin);
		System.out.println("Binary representation is "+sb.reverse() );
	}

}
