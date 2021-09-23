/*
13.      *
        * *
       *   *
      *     *
     *********
*/

static void pattern13(int n){
        for (int row=1; row<= n ; row++) {
            for (int space = row; space < n ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2*row -1) ;col++) {
                if( col == 1 || row == n || col == (2*row-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
