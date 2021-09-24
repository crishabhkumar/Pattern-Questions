/*
14.  *********
      *     *
       *   *
        * *
         *
*/

static void pattern14(int n){
        for (int row=1; row <= n ; row++) {
            for (int space = 1; space <= row ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col <= (2*n - row) ;col++) {
                if( col == row || row == 1 || col == 2 * n - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
