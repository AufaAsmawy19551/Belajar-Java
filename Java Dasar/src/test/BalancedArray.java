package test;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[]arr = new int[n];
            int jr = 0;
            int jl = 0;

            for (int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
                jr += arr[j];
            }

            boolean result = false;
            for (int k = 0; k < n; k++){
                jr -= arr[k];
                if (jl == jr){
                    result = true;
                    break;
                }else {
                    jl += arr[k];
                }
            }

            if (result){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
