import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num;
        num=sc.nextLong();

        long pos,digit,swap_digit,res_num;
        
        pos=100;
        res_num=0;
        while(true){
            digit=(num/pos)%100;
            if((digit<10)||(digit==0)){
                break;
            
            }
            swap_digit=digit%10;
        }
    }
}
