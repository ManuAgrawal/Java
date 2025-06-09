import java.util.Scanner;
class Student{
    String name="modi";
    void sum(int a,int b){
        System.out.println(a+b);
    }
}

public class class_object {
    public static void main(String[] args) {
        Student obj=new Student();
        Student obj1=new Student();
        obj.sum(5,2);
    }
}
