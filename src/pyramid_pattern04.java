public class pyramid_pattern04 {
    public static void main(String[] args) {
        int i,j,k,l;
        for(i=1;i<=5;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 5; k >= i; k--) {
                System.out.print("<");
            }
            for(l=5;l>=i;l--)
            {
                System.out.print(">");
            }
            System.out.println();
        }
    }
}
