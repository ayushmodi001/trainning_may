import java.util.Scanner;

class num_pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count+" ");
                count ++;
            }
            System.out.println("");
        }
    }
}