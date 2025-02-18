import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] numbers = new int[5];
Scanner in = new Scanner(System.in);
int sum = 0;
System.out.println("Введите числа массива: ");
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = in.nextInt();
    sum += numbers[i];
}
System.out.println("Сумма массива равна: " + sum);
    }
}