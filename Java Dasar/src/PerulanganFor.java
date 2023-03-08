public class PerulanganFor {
    public static void main(String[] args) {
        //For Loop
        for (var counter = 1; counter <= 5; counter++){
            System.out.println("Perulangan Ke-" + counter);
        }
        //For Each
        int[] bilangan ={1,2,3,4,5};
        for (var angka : bilangan ){
            System.out.println("Perulangan Ke-" + angka);
        }
    }
}
