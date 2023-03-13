package test;

import java.util.Scanner;

public class PesanRahasia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String result = "";

    for (int i = 0; i < n; i++) {
      Character ni = sc.next().charAt(0);

      if(Character.isLetter(ni)) {
        result += ni;
      }
    }

    System.out.println(result);
  }  
}
