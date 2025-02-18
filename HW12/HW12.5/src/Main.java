import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = sc.nextInt();
    if (n>0){
        System.out.println("Число положительное!");
    }
    if (n<0) {
        System.out.println("Число отрицательное!");
    } if (n==0) {
        System.out.println("Число равно нулю!");
        }
    }
}