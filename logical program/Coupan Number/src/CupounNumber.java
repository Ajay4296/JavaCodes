import java.util.Scanner;
import java.util.Random;
public class CupounNumber {

	public static void distinctCouponsGenerator(int num)
	{
	  int[] array=new int[num];
	int m=0,c=0,cc=-1,rr=0;
	Random r=new Random();
	while(m<num)
	{
	int nn=r.nextInt(num);
	rr++;
	if(cc==-1)
	{
	array[++cc]=nn;
	m++;
	}
	else
	{
	for(int i=0;i<=cc;i++)
	{
	if(nn==array[i])
	c++;
	}
	if(c==0)
	{
	array[++cc]=nn;
	m++;
	}
	c=0;
	}
	}
	CupounNumber.print(array,rr,num);

	}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		distinctCouponsGenerator(num);
		
	}
	public static void print(int[] n,int m,int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.print(" "+n[i]);
		}
		System.out.println("/n Random count="+m);
	}
		
		
		
		
		
		
		
	}


