
class Book
{
   
    
        String book;
        float price;
        Book()
        {
            book = "Java Programming";
            price = 100.0f;
        }
        void display()
        {
            System.out.println("Book Name : "+book);
            System.out.println("Book Price : "+price);
        }
       
    public static void main(String arg[])
    {
            Book b=new Book();
            b.display();
            
    }
}