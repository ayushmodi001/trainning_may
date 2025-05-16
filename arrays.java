import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.println("Enter 5 numbers:");
        for(int idx=0;idx<arr.length;idx++){
            arr[idx]=sc.nextInt();
        }
        for (int ind = 0; ind < arr.length; ind++) {
            sum+= arr[ind];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sum + " ");
        }
    }
}