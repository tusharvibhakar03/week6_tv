package Week6;

import java.util.Scanner;

public class prog6 {
    public static void main(String[] args) {
        double base, height,area;
        Scanner car  = new Scanner(System.in);
        System.out.println("enter base");
        base = car.nextDouble();
        System.out.println("enter height");
        height=car.nextDouble();
        area= base*height/2;
        System.out.println("Area of Triangle  is"+area);
    }
}


