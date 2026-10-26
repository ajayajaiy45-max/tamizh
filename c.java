import java.util.*;
class Main {
    public static void main(String[] args) {
        int mark[]=new int[5];
        Scanner scan= new Scanner(System.in);
        for(int i=mark.length-1;i>=0;i--){
            mark[i]=scan.nextInt();
        System.out.println(Arrays.toString(mark));
        }
    }
} 