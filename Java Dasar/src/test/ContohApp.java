package test;

public class ContohApp {
    public static void main(String[] args) {
        Contoh contoh1 = new Contoh("Aufa", 20);

        Integer a = 20;
        String b = String.valueOf(a);

//        int c = Integer.parseInt();
//        Integer d = Integer.valueOf();

        System.out.println(a.getClass().getTypeName());
        System.out.println(b.getClass().getTypeName());

        System.out.println(contoh1);
    }
}
