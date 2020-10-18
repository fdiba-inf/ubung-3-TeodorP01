package exercise3;

import java.util.Scanner;
import java.lang.*;

public class Triangle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
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




































