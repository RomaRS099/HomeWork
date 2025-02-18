import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Введите строку: ");
String in = sc.nextLine();
String out = in.replace('а', 'в').replace('А', 'В');
System.out.println("Заменённый текст: " + out);
    }
}