import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_terms;
        int term1, term2, term3;
        term1 = 0;
        term2 = 1;
        System.out.print("Enter the number of terms: ");
        num_terms = sc.nextInt();
        System.out.print("Fibonacci Series: " + term1 + ", " + term2);
        for (int i = 3; i <= num_terms; i++) {
            term3 = term1 + term2;
            System.out.print(", " + term3);
            term1 = term2;
            term2 = term3;
        }
        System.out.println();
    }
}
