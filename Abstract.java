abstract class Demo
{
    abstract void Abstdemo();
}

class Derived extends Demo
{
    public void Abstdemo()
    {
        System.out.println("Abstract method in base class");
    }

}

public class Abstract 
{
    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.Abstdemo();
    }    
}
