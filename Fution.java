import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUMBER");
           int b=scan.nextInt();
        System.out.println("ENTER THE 2ND NUMBER");
        int a=scan.nextInt();
        System.out.println("ENTER THE 3ND NUMBER");
        int c=scan.nextInt();
        if(a>b&&a>c){
            System.out.println("Greater number in:"+a);
        }
        else if(b>a&&c>b){
            System.out.println("Greater numberis:"+b);
        }
        else{
            System.out.println("Greater number is:"+c);
        }
        
    }
}