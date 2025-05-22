import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] matrix=new int[100][100];
        for (int itr= 0; itr <=rows; itr++) {
            for (int j = 0; j <= cols; j++) {
                matrix[itr][j]=sc.nextInt();
            }
        }
        for (int itr = 0; itr < rows; itr++) {
            for (int j = 0; j < cols ; j++) {
                System.out.println(matrix[j][itr]);
            }
        }
    }
}
