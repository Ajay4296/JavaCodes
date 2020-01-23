
public class MonthlyPayment {

	public static void main(String[] args) {
		int p=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int r=Integer.parseInt(args[2]);
	double sol	= monthlyPayment(p,y,r);
	System.out.println(" "+sol);
	}
		public static double monthlyPayment(int p,int y,int r)
		{
			double val1 = (float)(r*p/1200);
			double val2 = 1+(float)r/1200;
			 double val3=1-Math.pow(val2, -(12*y));
			//double ps=(float)val1/val3;
			return val1/val3;
		}

	}


