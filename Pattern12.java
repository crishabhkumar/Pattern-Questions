/*
12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
*/
static void pattern12(int n){
        for (int row = 0; row <= 2 * n - 1; row++) {
            int tot_space = row < n ? row : 2*n - row - 1;
            for (int space = 0; space < tot_space; space++) {
                System.out.print(" ");
            }
            int tot_col_in_rows = row < n ? n-row : row - n + 1;
            for (int col = 0; col < tot_col_in_rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
