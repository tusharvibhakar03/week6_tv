package Week6;

public class prog4 {
    int a=1; int b=2; static int c =3; static int d=4;
    public static void main(String[] args) {
    prog4 h=new prog4();
    System.out.println(h.a);
    System.out.println(h.b);
    System.out.println(prog4.c);
    System.out.println(prog4.d);
    h.him();
    her();
    }


    public void him(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void her(){
        System.out.println(prog4.c);
        System.out.println(prog4.d);

    }


}
