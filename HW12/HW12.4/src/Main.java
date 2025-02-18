import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n = sc.nextInt();
        System.out.print("Введите первое число: ");
        int m = sc.nextInt();
        System.out.print("Введите первое число: ");
        int k = sc.nextInt();

        int max = n;
        if(m>max) {
           max = m;
        } if(k>max) {
            max = k;
        }
        System.out.println("Наибольшее число: " + max);
    }
}