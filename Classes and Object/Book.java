public class Book
{
    String title;
    double price;
    Book()
    {
        title="Java Programming";
        price=100.0;
        display();
    }
    void display()
    {
        System.out.println("Book Title: "+title);
        System.out.println("Book Price: "+price);
    }
	public static void main(String[] args) 
	{
	    Book obj=new Book();
	}
}