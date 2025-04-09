import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
                System.out.println("enter the value");
                int a= sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thureday");
                        break;
                    case 5:
                        System.out.println("friday");
                        break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("sunday");
                        break;
                    default:
                        System.out.println("Tum is desh ka wassi nhi ho, yaha sa nikal jao");
                }

            }
        }


