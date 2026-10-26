import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,7,8,15,17,91,15};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]) {
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
