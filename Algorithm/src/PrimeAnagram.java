import java.util.Scanner;
public class PrimeAnagram 
{
	static void primeAnagramPalin(int k)
	{
		int n , i;
		for(n=1;n<k;n++)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					break;
				
			}
			if(i==n)
				System.out.print(" "+n);
		}
	}
	 static void palindrom(int l)
	 {
		 int t=l;
		 int reverse=0;
		while(l>0)
		{
			reverse=reverse*10+l%10;
			l/=10;
		}
		if(t==reverse)
			System.out.println( +t+ "\n number is palindrome");
		else 
			System.out.println(" \n not pallindrome");
	 }

	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     primeAnagramPalin(n);
     palindrom(n);
     
     
    		

	}

}
