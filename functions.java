import java.util.Scanner;

public class functions {
    public static int powerof2(int base,int expo){
        int result=1;
        while(expo!=0){
            result=result*base;
            expo--;
        }
        return result;
    }
    public static int no_of_digits(int num){
        int res=0;
        while (num!=0) {
            num=num/10;
            res=num%10;
        }
        return res;
    }
    public static int sum_of_digits(int num){
        int add=0;
        while(num>0){
            add+=num%10;
            num/=10;
        }
        return add;
    }
    public static int isprime(int num){
        // if (num&2) {
            
        // }
        return 0;
    }
    public static int perfect_square(){
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int expo=sc.nextInt();
        System.out.println("Power of 2 is: "+powerof2(num,expo));
        System.out.println("No of digits is: "+no_of_digits(num));
        System.out.println("sum of digits is: "+sum_of_digits(num));
    }
}
