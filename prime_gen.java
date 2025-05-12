public class prime_gen {
    public static void main(String[] args) {
        int numofftr;
        for(int num=3,count=1;num<=10000000;num+=2){
            int until=(int) Math.sqrt(num);
            for ( int ftr = 3; ftr < until; ftr+=2) {
                if(num%ftr==0){
                    break;
                }
            }
            if (ftr) {
                
            }
        }
    }
}
