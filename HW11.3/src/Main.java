import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();

        Scanner in = new Scanner(input);
        int sum = 0;
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                sum += in.nextInt();
            } else {
                in.next();
            }
        }
        System.out.println("Сумма всех введенных чисел равна: "+sum);
    }
}