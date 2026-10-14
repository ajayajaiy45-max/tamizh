import java.util.*;
class Compare {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
           int b=scan.nextInt();
        int a=scan.nextInt();
        int c=scan.nextInt();
        if(a>b&&a>c)
            System.out.println(a);
        else if(b>a&&c>b)
            System.out.println(b);
        else
            System.out.println(c);
        
    }
}