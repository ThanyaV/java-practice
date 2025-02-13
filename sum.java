import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum_e = 0 ;
        int sum_o = 0 ;
        while(N>0){
            int last = N % 10 ;

            if(last % 2 == 0){
                sum_e = sum_e + last ;
            }
            else{
                sum_o = sum_o + last ;
            }

            N = N/ 10 ;
        }

        System.out.println("Sum of Odd Digit : " + sum_o);
        System.out.println("Sum of Even Digit : " + sum_e);
    }
}