import java.util.Scanner;
public class HarmonicNumber {
	public static void main(String[] args) {  
	float hn=1;
	int i=1,n,count;
	
	System.out.println("Enter nth  term");
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	System.out.println("enter difference");
	int d=input.nextInt();
	for(count=1;count<n;count++)
	{
		i+=d;
		hn+=(float)1/i;
	}
System.out.println("harmonic number of"+n+"term"+hn );
	}

}
