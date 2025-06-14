class sumarrayy{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        int sum[] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        int c=0;
        for(int i=0; i<arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        System.out.println("Sum of arr1: ");
        System.out.println(sum1);

        for(int k=0; k<arr2.length; k++){
            sum2 = sum2 + arr2[k];
        }
        System.out.println("Sum of arr2: ");
        System.out.println(sum2);

        c= sum1 + sum2;
        System.out.println("Sum : ");
        System.out.println(c);

    }
}