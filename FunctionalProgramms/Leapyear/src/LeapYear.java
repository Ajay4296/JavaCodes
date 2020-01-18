import java.util.Scanner;
public class LeapYear {
	
	public static void main(String[] args) {
System.out.println("enter year should be 4 integer");
Scanner sc = new Scanner(System.in);
int y = sc.nextInt();
if((y%4==0)&&(y%100!=0)||(y%400==0))
{
	System.out.println("leap year");
}
else
	System.out.println("not a leap year");

	}

}
