
class Animal
{
    String name;
   public void Sound()
    {
        System.out.println("This is parent class method");
    }
}

class Dog extends Animal
{
    public void name(String name )
    {
        System.out.println("The name of dog is"+name);
    }
    public void Sound()
    {
        super.Sound();
        System.out.println("This is subclass method ");
    }

    
}


public class InheritanceDemo 
{
    public static void main(String[] args) {
       Dog d = new Dog();
        //Animal obj =(Dog) new Animal();
       // obj.mains();
       // d.Sound();
        d.name("Zoe");
        d.Sound();
    }
    
}
