public class Counter
{
    static int count=0;
    Counter()
    {
        count++;
        System.out.println("Object Created! Current Count = "+count);
    }
	public static void main(String[] args) 
	{
	    Counter a=new Counter();
	    Counter b=new Counter();
	    Counter c=new Counter();
	}
}