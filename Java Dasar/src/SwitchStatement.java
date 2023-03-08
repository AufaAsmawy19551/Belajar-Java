public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 'A';
        StringBuilder a = new StringBuilder();
        switch(nilai){
            case 'A':
                System.out.println("\"Sangat Baik\"");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            case 'E':
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Tidak Layak Dinilai");
        }
    }
}
