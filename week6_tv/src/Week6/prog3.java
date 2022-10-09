package Week6;

public class prog3 {
 int a=5; static int b=10;
    public static void main(String[] args) {
     prog3 t= new prog3();
     System.out.println(t.a);
     System.out.println(t.b);
     t.car();
     bike();
    }

    public void car(){
     System.out.println(a);

    }

    public static void bike(){
     System.out.println(prog3.b);


    }


}
