import java.util.*;
class Calculator
{
    public void Add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Inputs for Addition : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum : "+(a+b));
    }
    public int Subtraction()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Inputs for Subtraction : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a-b;
    }
    public void Product(int a,int b)
    {
        System.out.println("Product : "+(a*b));
    }
    public int Division(int a,int b)
    {
        return a/b;
    }
}
public class Types_of_Methods
{
	public static void main(String[] args) 
	{
	    Calculator obj=new Calculator();
	    obj.Add();
		System.out.println("Subtraction : "+obj.Subtraction());
		System.out.println("Enter Inputs for Multiplication : ");
		Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        obj.Product(a,b);
        System.out.println("Division : "+obj.Division(a,b));
        in.close();
	}
}