import java.util.Scanner;
abstract class item
{
private String title;
private String author;
item(String title, String author)
{
this.title=title;
this.author=author;
} 

public String getTitle()
{
return title;
}
public String getAuthor()
{
return author;
}
abstract void display();
}
interface borrowInst
{
void inst();
}
class books extends item implements borrowInst
{
private String genre;
 books(String title, String author,String genre)
{
super(title,author);
this.genre=genre;
}
public void inst()
{
System.out.println("<<<Books should be returned on or before Due date!>>>");
}
public String getgenre()
{
return genre;
}
public void display(){
    System.out.println("Title = "+getTitle());
System.out.println("Author = "+getAuthor());
System.out.println("Genre = "+getgenre()); 
}
}
class borrowed extends books
{
private String borrowerName;
private String dueDate;
borrowed(String title,String author,String genre,String borrowerName, String dueDate)
{
    super(title,author,genre);
this.borrowerName=borrowerName;
this.dueDate=dueDate;
}
public String getBorrowerName(){
    return borrowerName;
}
public String getDueDate(){
    return dueDate;
}
public void display()
{
System.out.println("Title = "+getTitle());
System.out.println("Author = "+getAuthor());
System.out.println("Genre = "+getgenre()); 
System.out.println("Borrower Name = "+borrowerName);
System.out.println("Due Date = "+dueDate);
}
}
class libraryInheritanceAbstractInterface
{   
public static void main(String args[])
{
borrowed br=new borrowed("Pride and Prejudice","Jane austen","Romance Fiction","Crista joe","10.08.2025");
br.display();
br.inst();

}
}