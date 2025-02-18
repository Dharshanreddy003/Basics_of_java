public class Count_of_Distinct_Values
{
	public static void main(String[] args) 
	{
	    String str="ghhbhftd";
	    int count=0;
	    boolean duplicate=false;
	    for(int i=0;i<str.length();i++)
	    {
	        duplicate=false;
	        for(int j=i+1;j<str.length();j++)
	        {
	            if(str.charAt(i)==str.charAt(j))
	            {
	                duplicate=true;
	            }
	            
	        }if(duplicate==false)
	                count++;
	    }
	    System.out.println(count);
    }
}