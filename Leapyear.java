import java.util.*;
class Leapyear {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
        System.out.println("ENTER YEAR");
           int year=scan.nextInt();
        
        if(year%400==0|year%4==0|year%100!=0){
            System.out.println(year+"this year in leap year");
        }
        
        else{
            System.out.println(year+"this year is not leap year");
        }
        
    }
}