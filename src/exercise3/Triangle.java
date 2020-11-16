package exercise3;

import java.util.Scanner;
import java.lang.*;

public class Triangle {

    public static void main(String[] args) {
      
      Scanner input1 = new Scanner(System.in);
      Scanner input2 = new Scanner(System.in);
      Scanner input3 = new Scanner(System.in);
        
        double a = input1.nextInt();
        double b = input2.nextInt();
        double c = input3.nextInt();

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
        
      










        
        
    }

}




































