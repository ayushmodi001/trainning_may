import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        for(int index=0;index<arr.length;index++){
            arr[index]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int index=0;index<arr.length;index++){
            if(arr[index]<min){
                min=arr[index];
            }
            if(arr[index]>max){
                max=arr[index];
            }
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);   
    }
}
