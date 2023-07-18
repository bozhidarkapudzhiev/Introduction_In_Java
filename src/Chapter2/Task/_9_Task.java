package Chapter2.Task;

import java.util.Scanner;

public class _9_Task {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        char gender=scanner.nextLine().charAt(0);
        int idNumbers=Integer.parseInt(scanner.nextLine());
        long idForUsers =Long.parseLong(scanner.nextLine());
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(idNumbers);
        System.out.println(idForUsers);

    }
}
