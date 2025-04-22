import java.util.Scanner;
public class Percentage_CWH {
    public static void main(String[] args) {
        System.out.println("enter the number of 5 subject");
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks of 1st subject");
        int a= sc.nextInt();
        System.out.println("Marks of 2st subject");
        int b= sc.nextInt();
        System.out.println("Marks of 3st subject");
        int c= sc.nextInt();
        System.out.println("Marks of 4st subject");
        int d= sc.nextInt();
        System.out.println("Marks of 5st subject");
        int e= sc.nextInt();
        int marks = a+b+c+d+e;
        System.out.println("total marks ="+ marks);
        float percentage = marks/5;
        System.out.println("percentage =" + percentage);




    }
}