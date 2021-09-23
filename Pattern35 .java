/*
35.      0 0 0 0 0 0 0 0 0 0 0
         0 1 1 1 1 1 1 1 1 1 0
         0 1 2 2 2 2 2 2 2 1 0
         0 1 2 3 3 3 3 3 2 1 0
         0 1 2 3 4 4 4 3 2 1 0
         0 1 2 3 4 5 4 3 2 1 0
         0 1 2 3 4 4 4 3 2 1 0
         0 1 2 3 3 3 3 3 2 1 0
         0 1 2 2 2 2 2 2 2 1 0
         0 1 1 1 1 1 1 1 1 1 0
         0 0 0 0 0 0 0 0 0 0 0
   */
static void pattern35(int n){
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n ; col++) {
                int atEveryindex = Math.min(Math.min(Math.min(row,col),n-row),n-col);
                System.out.print(atEveryindex + " ");
            }
            System.out.println();
        }
    }
