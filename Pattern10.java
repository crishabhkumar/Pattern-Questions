/*
10.      *
        * *
       * * *
      * * * *
     * * * * *
*/

static void pattern10(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
