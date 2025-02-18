//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] numbers = new int[20];
    System.out.print("Чётные числа в списке: ");
    for (int i = 1; i < numbers.length; i++) {
        if (i % 2 == 0) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }

    }
    }
}