abstract class Animal
{
    public final void makeSound() 
    {
        System.out.println("Animal makes a sound.");
    }

    public abstract void move();
}

class Dog extends Animal 
{
    public void move() 
    {
        System.out.println("Dog runs on four legs.");
    }
}

class Bird extends Animal 
{
    public void move()
    {
        System.out.println("Bird flies.");
    }
}

public class abstract_final
{
    public static void main(String[] args) 
    {
        Animal dog = new Dog();
        dog.makeSound();  
        dog.move();       

        Animal bird = new Bird();
        bird.makeSound();  
        bird.move();       
    }
}
