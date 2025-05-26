import java.util.Scanner;

public class array_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{7,4,8,2,9};
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1] && arr[i]>max){
                max+=1;
            }
        }
        System.out.println(max);
    }
}
