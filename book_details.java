import java.util.Scanner;
public class book_details
{
    String title;
    String author;
    float price;
    book_details(String title,String author,float price)
    {
        this.title= title;
        this.author= author;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title : "+title);
        System.out.println("author : "+author);
        System.out.println("price : "+price);
    }
    public static void main(String arg[])
    {
        book_details a=new book_details( "The black crow","Robert Frost",499.0f);
        a.display();
        
    }
}
