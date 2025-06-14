import java.util.*;
class array2{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter value of array");
        for(int i=n-1;i>0;i--){
            arr[i]=in.nextInt();
        }
        for (int k=1;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}