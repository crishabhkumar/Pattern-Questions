/*
4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print(col+ " ");
            }
            //when one row is printed we need to print new line
            System.out.println();
        }
    }

