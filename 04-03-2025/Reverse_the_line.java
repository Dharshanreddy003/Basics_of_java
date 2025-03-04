import java.util.*;
public class Reverse_the_line
{
    static void reverse(String str)
    {
        String res="",str1=" ";
        
        for(int i=str.length()-1;i>=0;i--)
        {
            if(i==str.length()-1 && str.charAt(str.length()-1)==' ')
                continue;
            else if(str.charAt(i)==' ' && (str.charAt(i+1)!=' ' || i==str.length()-1))
            {
                res+=str1;
                str1=" ";
            }
            else if(str.charAt(i)!=' ')
                str1=str.charAt(i)+str1;
            
        }
        res+=str1;
        System.out.println(res);
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the Sentence to Reverse : ");
	    String str=sc.nextLine();
	    reverse(str);
	}
}