public class Main {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd += arr[i];
            } else {
                even += arr[i];
            }
        }

        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
}
