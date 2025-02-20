import java.util.*;
class StudentDetails
{
    public void setValues(long[] regn,String[] namee,String Sname,long regno,int i,int n)
    {
        namee[i]=Sname;
        regn[i]=regno;
    } 
    
    public void display(int n,long[] reg,String[] name)
    {
        for(int i=0;i<n;i++)
            System.out.println(name[i]+" : "+reg[i]);
    }
    
}
public class Student_Details
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		StudentDetails s=new StudentDetails();
		long[] regn=new long[n];
        String[] namee=new String[n];
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter your Name:");
		    String name=sc.nextLine();
		    System.out.println("Enter your Register No:");
		    long reg=sc.nextLong();
		    sc.nextLine();
		    s.setValues(regn,namee,name,reg,i,n);
		}
		s.display(n,regn,namee);
	}
}