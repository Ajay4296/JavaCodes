import java.util.Scanner;

public class MergeSort 
{
	static int[] mergeSort(int a[],int f,int l)
	{
		if(f<l)
		{
			int m=(f+l)/2;
			mergeSort(a,f,m);
			mergeSort(a,m+1,l);
			mergeSort2(a,f,l,m);
		
		}
		return a;
		
	}
	static void mergeSort2(int[] a,int f,int l,int m)
	{
		int b[]=new int [l-f+1];
		int i=f,k=0;
		int j=m+1;
		while(i<=m&&j<=l)
		{
			if(a[i]<a[j])
				b[k++]=a[i++];
			else
				b[k++]=a[j++];
		}
		while(i<=m)
			b[k++]=a[i++];
		while(j<=l)
			b[k++]=a[j++];
		for(k=0;k<b.length;k++)
			a[f+k]=b[k];
			
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
		int[] m = mergeSort(ar,0,ar.length-1);
		System.out.println("after sorting the number:- ");
		for(int j=0;j<m.length;j++)
			System.out.print(m[j]+" ");
			
	}
	
	

}
