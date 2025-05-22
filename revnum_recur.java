public class revnum_recur {
    public static int revnum_recur(int n){
        return revnum_recur(n)     
    }
    public static void main(String[] args) {
        int n = 12345;
        int reversed = revnum_recur(n);
        System.out.println("Reversed number: " + reversed);
    }
}