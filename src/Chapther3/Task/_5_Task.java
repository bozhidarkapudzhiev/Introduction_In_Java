package Chapther3.Task;

import java.util.Scanner;

public class _5_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length=Double.parseDouble(scanner.nextLine());
        double height=Double.parseDouble(scanner.nextLine());
        double perimeter=2*(length+height);
        double area=(length*height);
        System.out.println("Perimeter="+perimeter);
        System.out.println("Area="+area);

    }
}
