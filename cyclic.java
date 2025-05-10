import java.util.Scanner;

public class cyclic {
    public static void main(String[] args) {
        long pos,num,digit,safe,cy_num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        cy_num=sc.nextLong(); 
        for(pos=1;num>=pos;pos*=10){
            pos/=10;
            safe=num;
            do{
                digit=num%10;
                num=num/10;
                num=digit*pos+num;
                System.err.println(num);
            }while((num!=safe)&&(num!=cy_num));
            if(num==cy_num)
                System.out.println("CYCLIC");
            else
                System.out.println("Not Cyclic");
        }
    }
}
