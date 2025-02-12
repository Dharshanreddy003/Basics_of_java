class Ternary_Operator
{
	public static void main(String args[])
	{
	    int a=10, b=23, c=58;
	   
	    int max =((a>b) && (a>c))?a:(b>c)?b:c;
	    System.out.println(max);
	}    
}