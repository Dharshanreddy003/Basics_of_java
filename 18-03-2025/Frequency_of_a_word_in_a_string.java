import java.util.*;
public class Frequency_of_a_word_in_a_string
{
    static void counter(String w[],String s)
    {
        int count=0;
        for(int i=0;i<w.length;i++)
        {
            if(s.equals(w[i]))
                count++;
        }
        System.out.println(s+" : "+count);
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String w[]=a.toLowerCase().split(" ");
	    boolean flag=false;
	    for(int i=0;i<w.length;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(w[i].equals(w[j]))
	            {
	                flag=true;
	                break;
	            }
	        }
	        if(!flag)
	        {
	            counter(w,w[i]);
	        }
	        flag=false;
	    }
		
	}
}