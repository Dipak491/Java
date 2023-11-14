import java.util.*;


public class ArraylistDemo{
    public static void main(String arg[])
    {
        System.out.println("Jai Ganesh...");

        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(23);
        a.add(45);
        System.out.println(a);

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)itr.next();

            if(i%2 ==0)
                 System.out.println(i);  
            else
                itr.remove();         
        }
        System.out.println(a);
    }
    
}
