//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int a = 5;
int b = 6;
System.out.println("До обмена: " + a + " " + b);

int temp = a;
a = b;
b = temp;
System.out.println("После обмена: " + a + " " + b);

    }
}