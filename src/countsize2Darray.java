class countsize2Darray {
    public static void main (String[] args){
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int totalCount = 0;


        for (int i = 0; i < arr.length; i++) {
            totalCount = totalCount+arr[i].length;
        }
        System.out.println(totalCount);
    }
}

