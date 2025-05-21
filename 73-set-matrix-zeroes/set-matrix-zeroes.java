class Solution {
        public void setZeroes(int[][] matrix) {

        // int n = matrix.length;
        // int m = matrix[0].length;

        // boolean [] row = new boolean [n];
        // boolean [] col = new boolean [m];

        // for(int i = 0; i  < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }
        
        // for(int i = 0; i  < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(row[i] || col[j]){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        
        int  n = matrix.length;
        int  m = matrix[0].length;

        boolean []  row = new boolean[n];
        boolean []  col = new boolean[m];

        // check if mat[i][j] == 0 set it to true
        for(int i = 0; i < n; i++){
            for(int j  = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        } 

        // and again if row[i] || col[j] id true set it as 0;
        for(int  i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}