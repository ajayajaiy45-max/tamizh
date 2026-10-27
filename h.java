public class Accurence {
    public static void main(String[] args) {
        int[] arr = {10,20,10,40,20,20,10};
        int element = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Element found");
            System.out.println("Occurrences: " + count);
        } else {
            System.out.println("Element not found");
        }
    }
}