package power;

public class power {

	public static void main(String[] args)
	{
		System.out.println("enter base");
		int b=Integer.parseInt(args[0]);
		System.out.println("enter power");
		int p=Integer.parseInt(args[1]);
		for(int i=1;i<=p;i++)
		{
			double val=Math.pow(b,i);
			System.out.println(b+"^"+i+"="+val);
		}
	 

	}

}
