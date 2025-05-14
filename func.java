import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        num=sc.nextInt();
        int sqr_num,rev_num,sqr_rev,rev_sqr_num,pos,digit;
        sqr_num=num*num;
        rev_sqr_num=0;
        for (pos = 1; pos <=num; pos++) {
            digit=(num/pos)%10;
            rev_num=rev_num*10+digit;
        }
        sqr_rev_num=rev_num*rev_num;
    }
}
