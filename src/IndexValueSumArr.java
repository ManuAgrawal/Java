public class IndexValueSumArr {
    public static void main (String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int[] arr = new int[arr1.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = arr1[i] + arr2[i];
        }
        System.out.println("Sum of arr1 and arr2: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
