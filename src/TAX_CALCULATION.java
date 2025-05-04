import java.util.Scanner;
public class TAX_CALCULATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your annual income = ");
        float tax = 0;
        float income =sc.nextFloat();
        if (income<=2.5f){
            tax=tax+0;
        }
        else if (income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income);
        }
        else if (income>5.0f && income<=10.0f) {
            tax = tax + 0.2f * (income);
        }
        else if (income>10.0f){
            tax = tax + 0.3f * (income);
        }
        System.out.println("total tax paid by user = " + tax);

    }
}
