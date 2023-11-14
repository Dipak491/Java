import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo {
    public static void main(String[] args) {

        LinkedList<Integer>l1 = new LinkedList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);

        LinkedList<Integer>l = new LinkedList<>();
        
        System.out.println("Size of linkedlist"+l.size());

        System.out.println("Add Operation ");
        for(int i =0; i<=10; i++)
        {
            l.add(i);
        }
        System.out.println("After add"+l);
       // l.add(3, 520);
        l.addAll(l1);

        System.out.println("After addAll"+l);

        //l.retainAll(l1);

        //System.out.println("after retainall"+l);

        System.out.println(l.get(2));

    
        System.out.println(l);
        System.out.println("Use ListIterator");

        ListIterator ls = l.listIterator();
        while(ls.hasNext())
        {
            Integer num = (Integer)ls.next();

            if(num%2==0)
            System.out.println(num);
            else if(num%5 == 0)
                System.out.println("Five");
        }

    }
}
