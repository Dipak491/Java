import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Raja");
        v.add("Ram");
        v.add("Kala");

        System.out.println(v);

        System.out.println("Use After For each Loop  ");

        for(String sfor :v)
        {
            System.out.println(sfor);
        }


        System.out.println("Use After Enumeration ");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            String str = (String)e.nextElement();

            System.out.println(str);
            
        }
    }
}
