class sumofmatrix {
    public static void main(String[] args){
        int[][] matrix = { {1, 12, 26 }, { 19, 25, 24 }, { 67, 18, 99 } };
        int sum = 0;
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of matrix: ");
        System.out.println(sum);
    }
}