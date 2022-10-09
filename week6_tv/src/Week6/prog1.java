package Week6;

public class prog1 {
 int a = 5; int b=10;

    public static void main(String[] args) {
        prog1 h =new prog1();
        System.out.println(h.a);
        System.out.println(h.b);
        h.mymethod();

    }

    public void mymethod(){
        System.out.println(a);
        System.out.println(b);
    }
}
