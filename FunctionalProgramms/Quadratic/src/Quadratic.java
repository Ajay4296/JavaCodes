import java.util.Scanner;

public class Quadratic {

	void quadraticRoots(int a,int b,int c)
	{
		if(a==0)
		{
			System.out.println("invalid number");
			return;
		}
		int D=b*b-4*a*c;
		double D_val=Math.sqrt(D);
		if(D>0)
			System.out.println("root are real and different");
		double root1=((-b)+D_val)/2*a;
		double root2=((-b)-D_val)/2*a;
		System.out.println("Root 1 is"  +root1);
		System.out.println("Root 2 is"  +root2);
		if(D<0)
		System.out.println("Root is complex");
		else
			System.out.println("Root are real and same");
	}
	public static void main(String[] args)
	{
		System.out.println("enter user value");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		Quadratic obj=new Quadratic();
		obj.quadraticRoots(a,b,c);
		
	}
	
}
