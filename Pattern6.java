/*
6.       *
        **
       ***
      ****
     *****
*/

static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            int tot_space = n-row-1;
            for (int sp = 0; sp < tot_space; sp++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
