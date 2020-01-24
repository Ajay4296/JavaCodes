import java.util.Scanner;
public class BinarySearch 
{
	static int binarySearch(int[] a,int f,int l,int ele)
	{
		if(f>l)
		return -1;
		int mid=f+l/2;
		if(a[mid]==ele)
			return mid;
		else if(a[mid]<ele)
		return binarySearch(a,0,mid-1,ele);
		else
			return binarySearch(a,mid+1,l,ele);
			
    
    
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the length of array");
	    int l=sc.nextInt();
	    System.out.println("enter the "+l+"number in sorted order " );
	    int array[]=new int[l];
	    for(int i=0;i<array.length;i++)
	   	array[i]=sc.nextInt();
	    System.out.println("enter the number you want to search");
	    int s=sc.nextInt();
	    int size=array.length-1;
	    int in=binarySearch(array,0,size,s);
	    if(in>-1)
	    
	    	System.out.println("element present at "+in+"place");
	    else
	    	System.out.println("number not present");
	    
	    


	}
	

}
