import java.util.Scanner;
public class day3assignment {

    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);
        System.out.print("Input any Number :");
        int n = sc.nextInt();

        if(n>=0)
        {
            System.out.println("Number is positive");
        }else
        {
            System.out.println("Number is negative");

        }

    }
}