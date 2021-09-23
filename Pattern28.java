/*
28.      *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
*/

static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int tot_col_in_rows = row > n ? 2 * n - row: row;
            //number of spaces = print that number of spaces;
            int noOfspaces = n - tot_col_in_rows;
            for (int s = 0; s < noOfspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < tot_col_in_rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
