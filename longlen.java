public class longlen {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        
        if (a >= b) {
            if (a >= c) {
                System.out.println("a is longest");
            } else {
                System.out.println("c is longest");
            }
        } else {
            if (b >= c) {
                System.out.println("b is longest");
            } else {
                System.out.println("c is longest");
            }
        }
    }
}
