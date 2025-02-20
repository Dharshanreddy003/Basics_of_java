import java.util.*;
public class Car
{
    String brand;
    Car()
    {
        brand="unknown";
    }
    void setBrand()
    {
        System.out.println(brand);
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the New Brand Name:");
		brand=sc.next();
		System.out.println("New Brand:"+brand);
    }
	public static void main(String[] args) 
	{
	    Car obj=new Car();
	    obj.setBrand();
	}
}