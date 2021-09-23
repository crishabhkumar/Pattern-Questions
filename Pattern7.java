/*
7.   *****
      ****
       ***
        **
         *
*/


static void pattern7(int n){
        for (int row = 0; row < n; row++) {
            for (int sp = 0; sp < row; sp++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
