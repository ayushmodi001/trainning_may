import java.util.Scanner;

public class num_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n/=10;
            count+=1;
        }
        System.out.println(count);
    }
}
