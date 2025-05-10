import java.util.Scanner;

public class Narcisstic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalNum = num;
        int temp, sum = 0;
        int digits = String.valueOf(num).length();
        
        while(num>0){
            temp=num%10;  
            sum += Math.pow(temp, digits);
            num/=10;
        }
        
        if(originalNum == sum) {
            System.out.println(originalNum + " is a narcissistic number");
        } else {
            System.out.println(originalNum + " is not a narcissistic number");
        }
        sc.close();
    }
}
