import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
	int price	=menu();
		int change = moneyInserted(price);
		returnChange(change);
		
		

	}
	public static int menu()
	{
		System.out.println("enter food choice"+"snickers 105 "+"/n"+"water 111"+"cold drinks 115");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 105:
			System.out.println("snicker");
			break;
		case 111:
			System.out.println("water");
			break;
		case 115:
			System.out.println("cold drink");
			break;
		
		}
		System.out.println("it's price is=");
		int p=sc.nextInt();
		return p;
		
	}
	public static int moneyInserted(int Price){
	    Scanner keyboard = new Scanner(System.in);
	    int money = 0;
	    System.out.println("Your item costs: " + Price + " Please insert  money:");
	    money = keyboard.nextInt();
	    while (money < Price){
	        System.out.println("Please insert sufficient funds");
	        money = money + keyboard.nextInt();
	    }
	    return money - Price ;
	}
	
	
	
	
	public static void returnChange( int change)
	{ 
		int array[]= {1,2,5,10,50,100,1000};
		int i=array.length-1;
		int count=0;
		for( ;change>=0 && i>=0;i--)
		{
		  while(change>=array[i])
			{
				change=change-array[i];
				count++;
				System.out.println("note is "+array[i]);
			
			}
		
	}
	
	System.out.println("minimum number of notes =  "+count);

     }
}
