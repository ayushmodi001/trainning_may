//given a string str consistring of opening and lcosing parenthesis '(' and ')'  the task is to find the length of the longest valid parenthesis substring
import java.util.Scanner;
public class validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String str = sc.nextLine();
        int maxLength = 0;
        int currentLength = 0;
        int openCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount > 0) {
                    openCount--;
                    currentLength += 2;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    currentLength = 0; 
                }
            }
        }
        System.out.println(maxLength);
    }
}                                                       