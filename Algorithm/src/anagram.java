import java.util.Scanner;
import java.util.Arrays;
public class anagram {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.nextLine();
		System.out.println("enter another string");
		String str2=sc.nextLine();
	str1 =	removeSpace(str1);
	str2 =	removeSpace(str2);
	boolean b=compare(str1,str2);
	if(b)
		System.out.println("string is anagram ");
	else
		System.out.println("string is not anagram");
		

	}
	static String removeSpace(String str)
	{
		String s = " ";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				s=s+ch[i];
			}
			
		}
		return s;
	}
	static boolean compare(String str1,String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		else
		{
			str1=toLowerCase(str1);
			str2=toLowerCase(str2);
			str1=Sort(str1);
			str2=Sort(str2);
		
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				return false;
				
			} 
			return true;
		}
		}
		static String toLowerCase(String str)
		{
			String nstr =" ";
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
					nstr=nstr+(char)(ch[i]+32);
				else 
					nstr = nstr+ch[i];
				
			}
			return nstr;
			
		}
		
	static String Sort(String str)
		{
		
			char[]ch=str.toCharArray();
			 Arrays.sort(ch);
		/*	for(int i=0;i<ch.length;i++)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j] = t;
				}
			}*/
			String st = new String(ch);
			return st;
}
	}


