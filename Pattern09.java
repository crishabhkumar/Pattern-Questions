/*
9.  *********
     *******
      *****
       ***
        *
*/

static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=  2 * (n - row - 1) ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
