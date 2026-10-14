import java.util.*;
class Findnum {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
           int num=scan.nextInt();
        
        if(num>0){
            System.out.println(num+"=positive");
        }
            else if(num==0){
                System.out.println("number is ZERO");
            }
        
        else{
            System.out.println(num+"=negative");
        }
        
    }
}