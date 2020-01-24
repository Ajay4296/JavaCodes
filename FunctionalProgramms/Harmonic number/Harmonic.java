
public class Harmonic {

	public static void main(String[] args) {
		int n=5;
		
		System.out.println(nthHarmonic(n));


	}
	 static double nthHarmonic(int num)
	{ 
		 double H=1;
		 
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		System.out.println("enter common difference");
			int d=sc.nextInt();
		 for(int a=2;a<=num;a++)
		 
		 {  
			 H=H+(float)1/d;
			 
			 
		 }
		 return H;
		
	}

}
