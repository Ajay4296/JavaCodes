
public class StringPermutation {

	public static void main(String[] args) {
		String str="ajay";
		String str2=" ";
		permute(str,str2);
	}
		
	public  static void permute(String str,String str2)	
	{
		if(str.length()==0)
		{System.out.println(str2+" ");
		return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String ros= str.substring(0,i)+ str.substring(i+1);
			permute(ros,str2+ch);
		}
		

}
}
