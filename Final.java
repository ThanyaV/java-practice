abstract class MyAbstractClass 
{
    private static final String CONSTANT_VALUE = "This is a constant";
    private final int value;

    public MyAbstractClass(int value) 
    {
        this.value = value;
    }

    public abstract void displayInfo();

    public static String getConstantValue() 
    {
        return CONSTANT_VALUE;
    }

    public int getValue() 
    {
        return value;
    }
}

class ConcreteClass extends MyAbstractClass 
{
    public ConcreteClass(int value) 
    {
        super(value);
    }

    public void displayInfo() 
    {
        System.out.println("Value: " + getValue());
        System.out.println("Constant: " + getConstantValue());
    }
}

public class Final 
{
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass(10);
        obj.displayInfo();
    }
}
