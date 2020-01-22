import java.util.Scanner;
import java.util.Date;
public class StopWatch {

	public static void main(String[] args) 
	{ 
		try
		{
			long start =System.currentTimeMillis();
			System.out.println(new Date()+"/n");
			Thread.sleep(5*1000);
			System.out.println(new Date()+" ");
			long end = System.currentTimeMillis();
			long elapsedtime = end-start;
			System.out.println("elapsed time is="+ elapsedtime);
			
		}
		catch(Exception e)
		{
		System.out.println("got an exception");
	}

}
}
