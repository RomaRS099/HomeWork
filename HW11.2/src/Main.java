import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Неправильный ввод! Оценки 0 не существует!");
        }
        return x / y;

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите первую оценку: ");
            double x = in.nextDouble();
            System.out.print("Введите вторую оценку: ");
            double y = in.nextDouble();
            System.out.println(divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: введите корректные числовые значения!");
        }
    }
}