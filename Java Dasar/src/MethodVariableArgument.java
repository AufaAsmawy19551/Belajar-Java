public class MethodVariableArgument {
    public static void main(String[] args) {

        hasil("Aufa", 78,84,68,89,78);
    }
    static void hasil(String Nama, int...values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var rata_rata = total / values.length;
        String hasil = rata_rata >= 70 ? ("Selamat " + Nama + " Anda Lulus Ujian ") : ("Maaf " + Nama + " Anda TidakLulus Ujian ");
        System.out.println(hasil);
    }
}
