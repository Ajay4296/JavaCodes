
public class Dayofweek {

	public static void main(String[] args) 
	{
		int mon=Integer.parseInt(args[0]);
		int date=Integer.parseInt(args[1]);
	    int year=Integer.parseInt(args[2]);
	    year=year-(14-mon)/12;
	    int x=year + year/4-year/100+year/400;
	    mon=mon+12*((14-mon)/12)-2;
	    int day=(date+x+31*mon/12)% 7;
	   
System.out.println(" "+day);
switch(day)
{
case 0:
System.out.println("sunday ");
break;
case 1:
System.out.println("monday ");
break;
case 2:
	System.out.println("tuesday");
	break;
case 3:
	System.out.println("wed");
	break;
case 4:
	System.out.println("thurs ");
	break;
case 5:
	System.out.println(" friday");
	break;
case 6:
	System.out.println("sat ");
	break;
}
	}

}
