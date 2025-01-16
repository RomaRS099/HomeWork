import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите длину стороны квадрата: ");
        int a = num.nextInt();
        int area = a*a;
        int perimeter = a*4;
        double diagonal = a*Math.sqrt(2);
        System.out.println("Площать квадрата: " + area);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Длина диагонали квадрата: " + diagonal);

    }
}