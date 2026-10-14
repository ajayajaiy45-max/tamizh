import java.util.*;
class Oddoreven {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
           int b=scan.nextInt();
        int a=scan.nextInt();
        int c=scan.nextInt();
        if(a==0)
            System.out.println("zero");
        else if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
        
    }
}