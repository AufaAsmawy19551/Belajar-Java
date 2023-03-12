package test;

import java.util.Scanner;

public class Coba {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();

        if (w % 2 == 0){
            if ((w / 2) % 2 == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }else {
            System.out.println("NO");
        }


//        Scanner sc = new Scanner(System.in);
//
//        String[] belalang = {"be", "la", "la", "ng"};
//        int sukuKata = 0;
//
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++){
//            if (belalang[sukuKata].equals(sc.next())){
//                sukuKata++;
//            }
//
//            if (sukuKata == 4){
//                break;
//            }
//        }
//
//        if (sukuKata == 4){
//            System.out.println("BISA");
//        }else {
//            System.out.println("TIDAK");
//        }


//        Scanner sc = new Scanner(System.in);
//
//        String word = sc.next();
//        String result = "";
//
//        if (word.length() > 10){
//             result = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
//        }else {
//            result = word;
//        }
//
//        System.out.println(result);




//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        boolean hard = false;
//        for (int i = 0; i < n; i++){
//            if(sc.nextInt() == 1){
//                hard = true;
//                break;
//            }
//        }
//
//        if (hard == true){
//            System.out.println("HARD");
//        }else {
//            System.out.println("EASY");
//        }




//        String singkatan = "";
//        while (true){
//            System.out.print("Masukkan kata: ");
//            String kata = sc.nextLine();
//            if (kata.equals(".")){
//                break;
//            }else{
//                singkatan += kata.charAt(0);
//            }
//        }
//
//        System.out.println(singkatan);

//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Masukkan tagihan: ");
//        Integer tagihan = sc.nextInt();
//
//        System.out.print("Masukkan pembayaran: ");
//        Integer pembayaran = sc.nextInt();
//
//        Integer[] pecahan = {20000, 10000, 5000, 1000, 500};
//
//        if (tagihan <= pembayaran ){
//            Integer kembalian = pembayaran - tagihan;
//            for (int i = 0; i < pecahan.length; i++){
//                Integer cacah = 0;
//
//                while (true){
//                    if (kembalian >= pecahan[i]){
//                        kembalian -= pecahan[i];
//                        cacah++;
//                    }else {
//                        break;
//                    }
//                }
//
//                if (cacah > 0){
//                    System.out.println(cacah + " pecahan " + pecahan[i]);
//                }
//            }
//        }else {
//            System.out.println("Pembayaran kurang!");
//        }
    }
}
