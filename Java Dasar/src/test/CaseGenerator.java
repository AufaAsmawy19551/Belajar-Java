package test;

import java.util.Random;

public class CaseGenerator {
  public static void main(String[] args) {
    String[] kata = "Informatika".split("");
    int jarak = 50;
    
    long counter = 0;
    String result = "";
    Random random = new Random();

    for (int i = 0; i < kata.length; i++) {
      int ni = random.nextInt(jarak);
      for  (int j = 0; j < ni; j++){
        result += random.nextInt(10) + " ";
        counter++;
      }
      result += kata[i] + " ";
      counter++;
    }

    int ni = random.nextInt(jarak);
    for  (int j = 0; j < ni; j++){
      result += random.nextInt(10) + " ";
      counter++;
    }

    System.out.println(counter);
    System.out.println(result);
  }
}
