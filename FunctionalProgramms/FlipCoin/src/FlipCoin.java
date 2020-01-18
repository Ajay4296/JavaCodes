import java.util.Scanner;
public class FlipCoin {
public static void main(String[] args) {
	int headcount=0;
	int tailcount=0;
	System.out.println("enter num of time want to flipcoin");
	Scanner sc = new Scanner(System.in);
int	n = sc.nextInt();
for(int i=0;i<=n;i++)
{
	if(Math.random()<0.5)
	{
		System.out.println("Head");
		headcount+=1;
	}
	else {
		System.out.println("tail");
		tailcount+=1;
	}
}
System.out.println(""+headcount);
System.out.println(" "+tailcount);
System.out.println("percent of head"+(headcount*100)/n);
System.out.println("percent of head"+(tailcount*100)/n);

			
}


}
