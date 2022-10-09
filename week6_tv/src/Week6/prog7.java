package Week6;

import java.util.Scanner;

public class prog7 {
    public static void main(String[] args) {
        double F,C;
        Scanner t =new Scanner(System.in);
        System.out.println("Celsicus = (F-32)*5/9");
        System.out.println("enter fahrenhiet  in F  field");
        F=t.nextDouble();
        C = (F-32)*5/9;
        System.out.println("Celsius Degree is "+C);





    }
}
