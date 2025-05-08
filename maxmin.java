import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        int line1, line2, line3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of line 1: ");
        line1 = sc.nextInt();
        System.out.println("Enter the length of line 2: ");
        line2 = sc.nextInt();
        System.out.println("Enter the length of line 3: ");
        line3 = sc.nextInt();
        int max, min;
        max = line1>line2 ? line1 : line2;
        max = max>line3 ? max : line3;
        min = line1<line2 ? line1 : line2;
        min = min<line3 ? min : line3;
        System.out.println((line1+line2+line3) - (max - min));
    }
}
