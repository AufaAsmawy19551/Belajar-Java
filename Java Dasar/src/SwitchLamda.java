public class SwitchLamda {
    public static void main(String[] args) {
        var data = 'A';
        switch(data) {
            case 'A' -> System.out.println("Sangat Baik");
            case 'B' -> System.out.println("Baik");
            case 'C' -> System.out.println("Cukup");
            case 'D' -> System.out.println("Kurang");
            case 'E' -> System.out.println("Sangat Kurang");
            default  -> System.out.println("Tidak Layak Dinilai");
        }
    }
}
