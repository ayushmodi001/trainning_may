import java.util.Scanner;

public class pat_1234 {
    public static void main(String[] args) {
        int count=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}
