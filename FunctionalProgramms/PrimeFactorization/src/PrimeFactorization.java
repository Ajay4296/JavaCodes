import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i;
		while(n%2==0)
		{
			System.out.println(" "+2);
			n=n/2;

	}
		int t=n;
		for(i=3;i<=Math.sqrt(t);i=i+2)
		{
			while(n%i==0)
			{
				System.out.println(" "+i);
				n=n/i;
			}
		
		}
		if(n<2)
			System.out.println(n);

}
}
