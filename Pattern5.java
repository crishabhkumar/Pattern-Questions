/*
5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/

static void pattern5(int n){
        for (int row = 0; row < 2 * n - 1; row++) {
            if(row < n){
                for (int col = 0; col < row+1; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for (int col = 0; col < 2 * n -1 - row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        //Another way:
        for (int row = 0; row < 2*n; row++) {
            int tot_row = row > n ? 2*n-row: row;
            for (int col = 0; col < tot_row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
