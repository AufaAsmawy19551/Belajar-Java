package test;

import java.util.ArrayList;

public class BresenhamCircle {
    public static void main(String[] args) {
        int[]center = {0, 0};
        int r = 15;
        int x = 0;
        int y = r;
        int p = 1 - r;

        ArrayList<int[]> oktan = new ArrayList<>();

        int counter = 0;
        while (x < y){
            int[] point = {x, y};
            oktan.add(point);

            System.out.println("\nNo : " + counter + "\nX : " + x + "\nY : " + y + "\nP : " + p);

            if (p >= 0){
                x += 1;
                y -= 1;
                p += (2 * x) + 1 - (2 * y);
            }else {
                x += 1;
                p += (2 * x) + 1;
            }
            counter++;
        }

        int[][] oktan1 = new int[oktan.size()][2];
        int[][] oktan2 = new int[oktan.size()][2];
        int[][] oktan3 = new int[oktan.size()][2];
        int[][] oktan4 = new int[oktan.size()][2];
        int[][] oktan5 = new int[oktan.size()][2];
        int[][] oktan6 = new int[oktan.size()][2];
        int[][] oktan7 = new int[oktan.size()][2];
        int[][] oktan8 = new int[oktan.size()][2];

        for (int i = 0; i < oktan.size(); i++){
            oktan1[i][0] = oktan.get(i)[0];
            oktan1[i][1] = oktan.get(i)[1];

            oktan2[(oktan.size() - 1) - i][0] = oktan.get(i)[1];
            oktan2[(oktan.size() - 1) - i][1] = oktan.get(i)[0];

            oktan3[i][0] = oktan.get(i)[1];
            oktan3[i][1] = oktan.get(i)[0] * -1;

            oktan4[(oktan.size() - 1) - i][0] = oktan.get(i)[0];
            oktan4[(oktan.size() - 1) - i][1] = oktan.get(i)[1] * -1;

            oktan5[i][0] = oktan.get(i)[0] * -1;
            oktan5[i][1] = oktan.get(i)[1] * -1;

            oktan6[(oktan.size() - 1) - i][0] = oktan.get(i)[1] * -1;
            oktan6[(oktan.size() - 1) - i][1] = oktan.get(i)[0] * -1;

            oktan7[i][0] = oktan.get(i)[1] * -1;
            oktan7[i][1] = oktan.get(i)[0];

            oktan8[(oktan.size() - 1) - i][0] = oktan.get(i)[0] * -1;
            oktan8[(oktan.size() - 1) - i][1] = oktan.get(i)[1];
        }

        System.out.println("\nOktan 1 : ");
        for (int[] element : oktan1){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 2 : ");
        for (int[] element : oktan2){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 3 : ");
        for (int[] element : oktan3){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 4 : ");
        for (int[] element : oktan4){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 5 : ");
        for (int[] element : oktan5){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 6 : ");
        for (int[] element : oktan6){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 7 : ");
        for (int[] element : oktan7){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }

        System.out.println("\nOktan 8 : ");
        for (int[] element : oktan8){
            System.out.println("(" + (element[0] + center[0]) + ", " + (element[1] + center[1]) + ")");
        }
    }
}
