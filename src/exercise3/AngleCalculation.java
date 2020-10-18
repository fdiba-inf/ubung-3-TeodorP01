package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double grad = input.nextInt();
        double radiant = grad*Math.PI/180;
        System.out.println(radiant);

    }

}