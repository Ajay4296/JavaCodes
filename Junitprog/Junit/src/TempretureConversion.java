
public class TempretureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   java.util.Scanner sc =new java.util.Scanner(System.in);
   System.out.println("type of conversion /n 1.farenhite to celsius /n 2. celcius to farenhite");
   int type = sc.nextInt();
   switch(type)
   {
   case 1:
	   System.out.println("enter tempreture in farenhite");
	   int f=sc.nextInt();
	   double c= (f-32)*(float)5/9;
	   System.out.println("temp in celcius  "+c);
	   break;
   case 2:
	   System.out.println("enter tempreture in celcius");
	   int cel=sc.nextInt();
	   double farn= (cel*(float)9/5)+32;
	   System.out.println("temp in farenhite  "+farn);
	   break;
	   
   }
		

	}

}
