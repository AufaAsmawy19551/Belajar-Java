public class MethodRecursive {
    public static void main(String[] args) {

        System.out.println(faktorial(5));
    }
    static int faktorial(int value){
        if(value == 1){
            return 1;
        }else{
            return value * faktorial(value-1);
        }
    }
}
