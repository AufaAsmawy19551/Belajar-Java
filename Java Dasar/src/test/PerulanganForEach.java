package test;

public class PerulanganForEach {
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 6, 9, 12, 15, 18, 21};

        for (Integer element : numbers){
            System.out.println(element);
        }

        String[] fruits = {"mangga", "nanas", "apel", "semangka"};

        for (String element : fruits){
            if (element.equals("nanas") || element.equals("semangka")){
                System.out.println("Buah " + element);
            }
        }
    }
}
