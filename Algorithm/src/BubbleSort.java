import java.util.Scanner;

public class BubbleSort
{
	static int[] bubbleSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t =a[j];
					a[j]=a[j+1];
					a[j+1]=t;	
				}
				
				
				
			}
		}
		
		return a;
	}
 
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many of num you want to sort");
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("enter the "+n+" number");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		int[] m = bubbleSort(ar);
		System.out.println("after sorting the number:- ");
		for(int j=0;j<m.length;j++)
			System.out.println(m[j]+"");
			
	}
	}
	
	
	
	
	
	
	
	
	


