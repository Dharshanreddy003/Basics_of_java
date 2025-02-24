import java.util.*;
abstract class Circle
{
    static double area,circumference,r;
    static void get(int x)
    {
        r=x;
    }
    static void calc_area()
    {
        area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
    static void calc_circumference()
    {
        circumference=2*3.14*r;
        System.out.println("Area of Circumference: "+circumference);
    }
    
	public static void main(String[] args) 
	{
		get(5);
		calc_area();
		calc_circumference();
	}
}