package org.example;

public class SinglePattern {
    public static void main(String[] args) {
        System.out.println("enter the no rows");
        pattern13(5);
//        Scanner cin=new Scanner(System.in);
//        int n= cin.nextInt();

    }

//    1
//    0 1
//    1 0 1
    private static void pattern1(int n) {

        int bit=0;
        for(int i=1;i<=n;i++){

            bit= i%2== 0?0:1;
            for(int j=1;j<=i;j++){
                System.out.print(bit);
                bit=1-bit;
            }
            System.out.println();

        }
    }



//    1
//    2 3
//    4 5 6
    private static void pattern2(int n) {

        int val=1;
        for(int i=1;i<=n;i++){


            for(int j=1;j<=i;j++){
                System.out.print(val++ +" ");

            }
            System.out.println();

        }
    }


//
//    * * * *
//    * * *
//    * *
//    *
    private static void pattern3(int n) {


        for(int i=n;i>0;i--){


            for(int j=1;j<=i;j++){
                System.out.print("*" +" ");

            }
            System.out.println();

        }
    }
//    *
//    * *
//    * * *
//    * * * *
//    * * *
//    * *
//    *
    private static void pattern4(int n) {
        int temp=0;


        for(int i=1;i<=(n*2)-1;i++){

            int Change = i > n ? i - (temp+=2): i;
            for(int j = 1; j<= Change; j++){
                System.out.print("*" +" ");

            }
            System.out.println();

        }
    }
//                 *
//               * *
//             * * *
//           * * * *
//         * * * * *
//       * * * * * *
private static void pattern5(int n) {


    for (int i = 1; i <= n; i++) {
        int Change = i;
        for (int j = n; j > 0; j--) {
            if ((Change) == j) {
                Change--;
                System.out.print("❤️");
            } else {
                System.out.print(" ");
            }


        }
        System.out.println();

    }
}

//}
//        ⬜⬜⬜⬜⬜⬜⬜⬜⬜
//        ⬜⬜⬜⬜⬜⬜⬜⬜
//        ⬜⬜⬜⬜⬜⬜⬜
//        ⬜⬜⬜⬜⬜⬜
//        ⬜⬜⬜⬜⬜
//        ⬜⬜⬜⬜
//        ⬜⬜⬜
//        ⬜⬜
//        ⬜

    private static void pattern6 ( int n){


        for (int i = 1; i <= n; i++) {
            int Change = i;
            for (int j = n; j > 0; j--) {
                if ((Change) == j) {
                    Change--;
                    System.out.print(" ");
                } else {
                    System.out.print("🌟");
                }


            }
            System.out.println();

        }

    }

//            🌟🌟🌟🌟🌟
//            🌟😎😎😎🌟
//            🌟😎😎😎🌟
//            🌟😎😎😎🌟
//            🌟🌟🌟🌟🌟
    private static void pattern7 ( int n){

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j<= n; j++) {
                if (j==1 || i==1 || j==n  || i==n ) {

                    System.out.print("🌟");
                } else {
                    System.out.print("😎");
                }


            }
            System.out.println();

        }

    }
//                 *
//                ***
//               *****
//              *******
//             *********

    private static void pattern8 ( int n){

        for (int i = 1; i <= n ; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (i*2)-1; j++) {

                    System.out.print("*");
                }



            System.out.println();

        }

    }
//           *******
//            *****
//             ***
//              *
    private static void pattern9 ( int n){

        for (int i = n; i >0 ; i--) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (i*2)-1; j++) {

                System.out.print("*");
            }



            System.out.println();

        }

    }
//                *
//               ***
//              *****
//             *******
//              *****
//               ***
//                *
    private static void pattern10 ( int n){

        for (int i = 1; i <= n ; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (i*2)-1; j++) {

                System.out.print("*");
            }



            System.out.println();

        }
        for (int i = n-1; i >0 ; i--) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (i*2)-1; j++) {

                System.out.print("*");
            }



            System.out.println();

        }


    }
//                  *
//                 * *
//                *   *
//               *     *
//              *********
    private static void pattern11 ( int n){

        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (i*2)-1; j++) {
                if(j== 1 || j== (i*2)-1  ||  i == n){
                    System.out.print("*");

                }else {

                    System.out.print(" ");
                }
            }



            System.out.println();

        }

    }


//            **********
//            ****  ****
//            ***    ***
//            **      **
//            *        *
//            *        *
//            **      **
//            ***    ***
//            ****  ****
//            **********

    private static void pattern12 ( int n){

        int increment=0;
            for (int i = 1; i <= n * 2; i++) {
                if( i <=n) {
                for (int j = 1; j <= n * 2; j++) {
                    if (n - (i - 1) >= j || j > (n + i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }

            else{

                int Change=i-((increment*2)+1);
                increment+=1;
                for(int j=1;j<=n*2;j++){
                    if(n-(Change-1) >= j || j>(n+Change-1) ){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }


        }

    }

//            1 1 1 1 1 1 1 1 1
//            1 2 2 2 2 2 2 2 1
//            1 2 3 3 3 3 3 2 1
//            1 2 3 4 4 4 3 2 1
//            1 2 3 4 5 4 3 2 1
//            1 2 3 4 4 4 3 2 1
//            1 2 3 3 3 3 3 2 1
//            1 2 2 2 2 2 2 2 1
//            1 1 1 1 1 1 1 1 1

    private static void pattern13 ( int n){

        for (int i = 1; i < (n*2) ; i++) {
            for(int j=1;j<(n*2);j++) {
                int top=i,down=(n*2)-i,right=j,left=(n*2)-j;
                int val=Math.min(Math.min(top,down),Math.min(right,left));
                System.out.print(val+" ");
            }



            System.out.println();

        }
//        5 5 5 5 5 5 5 5 5
//        5 4 4 4 4 4 4 4 5
//        5 4 3 3 3 3 3 4 5
//        5 4 3 2 2 2 3 4 5
//        5 4 3 2 1 2 3 4 5
//        5 4 3 2 2 2 3 4 5          val=n-val+1;
//        5 4 3 3 3 3 3 4 5
//        5 4 4 4 4 4 4 4 5
//        5 5 5 5 5 5 5 5 5

    }
}
