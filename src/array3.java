import java.util.*;
class array3{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();}
        for(int i=0;i<n;i++){
            sum= sum + arr[i];
        }
        System.out.println("Sum of array is: ");
        System.out.println(sum);
    }
}
