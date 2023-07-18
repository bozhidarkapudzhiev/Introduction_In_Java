package Chapter2.Task;

public class _3_Task {
    public static void main(String[] args) {
        int number=256;
        boolean numberInOctal=(number==0x100);
        number=0x100;
        System.out.println(number);
        System.out.println(numberInOctal);
    }
}
