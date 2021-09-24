/*
32.    E
       D E
       C D E
       B C D E
       A B C D E
*/

static void pattern32(int n) {
        for (int row = n; row >= 1; row--) {
            int alphabet = 65;
            for (int col = row; col <= n; col++) {
                System.out.print((char) (alphabet + col - 1) + " ");
            }
            System.out.println();
        }
    }
