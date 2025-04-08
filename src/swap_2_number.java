public class swap_2_number {
    public static void main(String[] args) {
        // Swap two numbers using a temporary variable
        int a=10;
        int b=20;
        int c=a+b;
        b=c-b;
        a=b+a;
        System.out.println("output of a="+a);
        System.out.println("output of b="+b);
        //Swap two numbers without using third variable
        int d=15;
        int e =45;
        d=d+e;
        e=d-e;
        d=d-e;
        System.out.println("output of d="+d);
        System.out.println("output of e="+e);
    }
}
