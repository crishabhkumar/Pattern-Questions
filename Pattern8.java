/*
8.      *
       ***
      *****
     *******
    *********
    
    */

static void pattern8(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - 1 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= 2 * row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
