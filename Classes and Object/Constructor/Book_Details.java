public class Book_Details
{
    String title;
    String author;
    int price;
    Book_Details(String title,String author,int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Book Title : "+ title +"\nAuthor : "+ author +"\nPrice : "+ price);   
    }
	public static void main(String[] args) 
	{
	    Book_Details obj=new Book_Details("Java", "James Arumugam", 2509000);
	    obj.display();
	}
}