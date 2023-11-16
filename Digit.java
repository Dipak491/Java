import java.util.Scanner;



public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        DisplayDigit(n);

    }
    static void DisplayDigit(int x)
    {
        int iDigit=0;
        while(x !=0)
        {
            iDigit = x%2;
            System.out.println(iDigit);
            x = x/2;
        }
        System.out.println();
    }   
}
