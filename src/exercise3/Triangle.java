package exercise3;

import java.util.Scanner;
import java.lang.*;

public class Triangle {

    public static void main(String[] args) {

      double a;
      double b;
      double c;


      do{
      Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        double p = ((a+b+c)/2);
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
          if (a > 0 && b > 0 && c > 0)
           {
             if (a+b>c && a+c>b && b+c>a)
             {
              System.out.println("Area: " + area);
               if (a==b && b==c && c==a)
                {
                System.out.println("Triangle: equilateral");
                }
               else if (a==b || c==a || b==c)
                 {
                  System.out.println("Triangle: isosceles");
                 }
               else
                {
                 System.out.println("Triangle: scalene");
                }
             }
              else
              {
               System.out.println("Values are not correct!");
             }
          }  
        
           else
           {
             System.out.println("Values are not correct!");
           }
      }while (a>0 && b>0 && c>0);
        
      










        
        
    }

}




































