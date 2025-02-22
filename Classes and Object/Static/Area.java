import java.util.*;
public class Area
{
    static Scanner sc=new Scanner(System.in);
    static int area()
    {
        int a=sc.nextInt();
        int square=a*a;
        return square;
    } 
    static double area(int a)
    {
        double circle=3.14*a*a;
        return circle;
    }
    static int area(int a,int b)
    {
        int rectangle=a*b;
        return rectangle;
    }
	public static void main(String[] args) 
	{
		System.out.println("Area of Square : "+area());
		System.out.println("Area of Circle : "+area(7));
		System.out.println("Area of Rectangle : "+area(30,40));
	}
}