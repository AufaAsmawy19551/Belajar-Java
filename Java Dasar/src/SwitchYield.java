public class SwitchYield {
    public static void main(String[] args) {
        var nilai = 'A';
        var hasil = switch(nilai) {
            case 'A':
                yield "Sangat Baik";
            case 'B' :
                yield "Baik";
            case 'C':
                yield "Cukup";
            case 'D':
                yield "Kurang";
            case 'E':
                yield "Sangat Kurang";
            default:
                yield "Tidak Layak Dinilai";
        };
        System.out.println(hasil);
    }
}
