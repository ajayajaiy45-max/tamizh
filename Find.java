public class Find {
    public static void main(String[] args) {
        int a = 45;
        int b = 30;
        int c = 25;

        int largest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

        System.out.println("Largest number is: " + largest);
    }
}