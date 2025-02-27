import java.util.*;

class overload {
    public void automorphic(int x) 
    {
        
        int x1 = x;
        int x2=x;
        int multi = x * x;
        int digit = 1;
        int count=0;
        if (x < 10) {
            if (x == multi % 10) {
                System.out.println(x  );
            } 
        } else {
            do {
               digit++;
               x1=x1/10;
            } while (x1/10 > 0);
           for(int i=0;i<digit;i++)
           {
               if(multi%10==x2%10)
               {
                   count++;
                   multi=multi/10;
                   x2=x2/10;
               }
               else
               {
                   break;
               }
           }
           if(count==digit)
           {
               System.out.println(x );
           }
          
        }
    }
    public void range(int x,int y)
    {
       for(int i=x;i<=y;i++)
       {
          automorphic(i); 
       }
    }
}


public class Automorphic {
    public static void main(String[] args) {
        overload o = new overload();
        o.range(1,1000);
        
    }
}