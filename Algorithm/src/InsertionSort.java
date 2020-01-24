import java.util.Scanner;
public class InsertionSort 
{
	static  int[] insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
		int ele=a[i];
		while(j>=0&ele<[j])
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=ele;
		
		
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
	int[] m = insertionSort(ar);
	System.out.println("after sorting the number:- ");
	for(int j=0;j<m.length;j++)
		System.out.println(m[j]+"");
		
}
}