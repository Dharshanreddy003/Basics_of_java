abstract class Final 
{
    final int variable;
    //static int variable;
    Final()
    {
        variable=30;
    }
}

public class Main extends Final
{
    Main()
	{
	   super();
	}
	public static void main(String[] args) 
	{
	    Main obj=new Main();
		System.out.println(obj.variable);
	}
}