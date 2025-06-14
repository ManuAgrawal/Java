class rowwisesummatrix {
    public static void main(String[] args){
        int[][] matrix = { {1, 92, 26 }, { 19, 25, 24 }, { 66, 18, 89 } };
        int sum[] = new int[matrix.length];

        for (int i = 0; i<matrix.length; i++){
            int sumofRow = 0;
            for (int j = 0; j<matrix[i].length; j++){
                sumofRow = sumofRow + matrix[i][j];

            }
            System.out.println("Sum of row " + i + sumofRow);
        }

    }
}