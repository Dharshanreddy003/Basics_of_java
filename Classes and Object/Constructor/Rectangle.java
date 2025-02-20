public class Rectangle
{
    int width,length;
    Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle r)
    {
        length=r.length;
        width=r.width;
    }
    void display()
    {
        System.out.println("Length : "+ length +" Width : "+width);
    }
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(12,8);
		obj.display();
		Rectangle object=new Rectangle(obj);
		object.display();
	}
}