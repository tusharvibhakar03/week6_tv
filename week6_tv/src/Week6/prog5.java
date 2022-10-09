package Week6;

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        double radius, area;
        Scanner car  = new Scanner(System.in);
        System.out.println("enter radius");
        radius = car.nextDouble();
        area= Math.PI*radius*radius;
        System.out.println("Area of Circle is"+area);
        }



}
