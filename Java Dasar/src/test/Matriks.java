package test;

public class Matriks {
    public static void main(String[] args) {

        Integer[][] A = {
                {1, 2},
                {3, 4}
        };

        Integer[][] B = {
                {1, 2, 3},
                {-3, 2, 1}
        };

        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < B[0].length; j++){
                System.out.print(((A[i][0] * B[0][j]) + (A[i][1] * B[1][j])) + " ");
            }
            System.out.println();
        }
    }
}
