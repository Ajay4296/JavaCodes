import java.util.Scanner;
public class sumofTriplet {

	public static void main(String[] args) {
 System.out.println("enter the size of array");
 Scanner obj= new Scanner(System.in);
 int size= obj.nextInt();
  int[] num=new int[size];
  int k;
  System.out.println("enter in array");
  for(int i=0;i<size;i++)
  {
  
	  num[i]=obj.nextInt();
	
  }
for(int i=0;i<size-2;i++)
{
	for(int j=i+1;j<size-1;j++)
	{
		for(k=j+1;k<size;k++)
		{
			int sum=0;
			 sum=num[i]+num[j]+num[k];
			if(sum==0)
				System.out.println(num[i]+" "+num[j]+" "+num[k]);
if(k==size-1)
	System.out.println("not exist");
}
	
	}
}

}

	
}
