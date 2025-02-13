import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для вычисления его квадратного корня: ");
        try {
        int n = sc.nextInt();
        if (n < 0 ) {
            System.out.println("Число не может иметь отрицтельное значение!!!");
            return;
        }
            int sqrt = (int) Math.sqrt(n);
            System.out.println("Квадратный корень равен: " + sqrt);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода! Введите число!");
        }
    }
}