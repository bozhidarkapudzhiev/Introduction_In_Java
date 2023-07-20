package Chapther3.Task;

public class _2_Task {
    public static void main(String[] args) {
        int number=35;
        boolean equals5divider7=(number%5==0);
        boolean equals7divider5=(number%7==0);
        //System.out.println(equals);
        if (equals5divider7&&equals7divider5){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }

    }
}
