
public class windchill {
	public static void main(String[] args) {
		double t=Double.parseDouble(args[0]);
		double v=Double.parseDouble(args[1]);
		double windChill=35.75+0.6251*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		System.out.println("given a tempreture of"+t+"fahrenheit"+"and a wind speed of"+v+"mph");;
	System.out.println("the wind chill is"+windChill);	
		
	}

}
