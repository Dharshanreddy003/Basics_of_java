import java.util.*;
public class Frequency_of_a_Letters_in_a_String
{
    static String frequency(String str)
    {
        String result="";
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            int count=1;
            boolean letter=false;
            for(int j=0;j<i;j++)
            {
                if(str.charAt(j)==str.charAt(i))
                {
                    letter=true;
                    break;
                }
            }
            if(letter) continue;
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(j)==str.charAt(i))
                {
                    count++;
                }
            }
            result+=str.charAt(i)+":"+Integer.toString(count)+" ";
        }
        return result;
    }
    
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a String to Calculate the Frequency:");
		String str=sc.nextLine();
		System.out.println(frequency(str));
	}
}