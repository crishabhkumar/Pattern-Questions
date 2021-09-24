/*
33.    a
       B c
       D e F
       g H i J
       k L m N o
*/


static void pattern33(int n){
        Character num = 'a';
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if(count%2 == 1){
                    System.out.print(num.toString().toLowerCase() + " ");
                }else {
                    System.out.print(num.toString().toUpperCase() + " ");
                }
                count++;
                num++;
            }
            System.out.println();
        }
    }
