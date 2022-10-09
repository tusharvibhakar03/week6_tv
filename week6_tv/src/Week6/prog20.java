package Week6;

import java.util.Scanner;

public class prog20 {
    public static void main(String[] args) {
        int a =10; int b=20;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter 2 numbers and then add");
        a=t.nextInt();
        b=t.nextInt();
        System.out.println("Answer is"+(a+b));
        System.out.println("Enter 2 numbers and then substract");
        a=t.nextInt();
        b=t.nextInt();
        System.out.println("Answer is"+(a-b));
        System.out.println("Enter 2 numbers and then multiply");
        a=t.nextInt();
        b=t.nextInt();
        System.out.println("Answer is"+(a*b));
        System.out.println("Enter 2 numbers and then divide");
        a=t.nextInt();
        b=t.nextInt();
        System.out.println("Answer is"+(a/b));




    }
}

