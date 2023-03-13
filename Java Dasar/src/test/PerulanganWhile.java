package test;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        Integer angka = sc.nextInt();
        while (angka > 10){
            angka -= 1;
            System.out.println(angka);
        }
    }
}
