import java.util.*;
public class AlphaNumeric_string
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the String Value : ");
	    String str=sc.next(),str2="",ch="";
	    int num=0;
		for(int i=0;i<str.length();i++)
		{
		    if(Character.isDigit(str.charAt(i)))
		    {
		        num=num*10+(str.charAt(i)-'0'); 
		        if((i<str.length()-1 && !Character.isDigit(str.charAt(i+1)))|| (i==str.length()-1))
		        {
		            while(num>0)
		            {
		                str2=str2+ch;
		                num--;
		            }
		            ch="";
		        }
		    }
		    else 
		        ch=ch+str.charAt(i);
		}
		if(ch!="")
		    str2=str2+ch;
		System.out.println(str2);
	}
}


