import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q,r,trem,ans;
        q=n/3;
        r=n%3;
        if(r==1){
            System.out.println(q+" "+q+" "+(q+r));
            System.out.println(q+q+(q+r));
            System.out.println(q*q*(q+r));
        }
        else if(r==0){
            System.out.println(q+" "+q+" "+q);
            System.out.println(q+q+q);
            System.out.println(q*q*q);
        }
        else{
            System.out.println(q+" "+(q+r)+" "+(q+r));
            System.out.println(q+(q+r)+(q+r));
            System.out.println(q*(q+r)*(q+r));
        }
    }
}
