import java.util.*;
abstract class Circle_Scanner
{
    static double area,circumference,r;
    static void cal_area(int r)
    {
        area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
    static void cal_circumference(int r)
    {
        circumference=2*3.14*r;
        System.out.println("Area of Circumference: "+circumference);
    }
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		cal_area(r);
		cal_circumference(r);
	}
}