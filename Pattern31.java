/*
31.      4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
*/
static void pattern31(int n){
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n ; col++) {
                int atEveryIndex =  n - Math.min(Math.min(Math.min(row,col),2*n-row),2*n-col);
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
