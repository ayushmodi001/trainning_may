public class triangle {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("Is Triangle");
                }
            }else {
                System.out.println("Not Triangle");
            }
        }
    }
}
