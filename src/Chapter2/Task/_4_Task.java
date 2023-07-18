package Chapter2.Task;

import java.util.Scanner;

public class _4_Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean isMale;
        char gender=scanner.nextLine().charAt(0);
        if (gender=='m'){
            isMale=true;
        }else{
            isMale=false;
        }
        System.out.println(isMale);
    }
}
