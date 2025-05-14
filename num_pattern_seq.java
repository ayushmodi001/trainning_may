import java.util.Scanner;

public class num_pattern_seq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
            System.out.println("");
            for (int j=i;j>=i-1;j--){
                System.out.print(j+" ");
            }
        }
    }
}
