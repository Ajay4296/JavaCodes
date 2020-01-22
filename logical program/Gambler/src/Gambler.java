import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
	int $stake,$goal;
	int win=0;
	int bet=0;
	System.out.println("enter trial");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	System.out.println("enter stake");
	
	$stake=scan.nextInt();
	System.out.println("enter goal");
	$goal=scan.nextInt();
			for(int i=1;i<=n;i++)
			{
				int cash=$stake;
				while(cash>0 &&cash<$goal) 
				{
					bet++;
					if(Math.random()<0.5)
					cash++;
					else
						cash--;
				}
				if(cash==$goal)
					win++;
			}
			System.out.println("num of time win ="+" "+win);
			System.out.println("num of time win ="+" "+bet);
			System.out.println("percent of win ="+" "+(100.0*win)/n);
			System.out.println("avg of Bet ="+" " +1.0*bet/n);		
					
				
				
				
			}

	}


