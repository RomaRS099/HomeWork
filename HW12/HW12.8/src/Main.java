import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] numbers = new int[5];
int firstNumber = Integer.MAX_VALUE;
int secondNumber = Integer.MAX_VALUE;
Scanner sc = new Scanner(System.in);
System.out.print("Введите 5 чисел: ");
for (int i = 0; i<numbers.length; i++){
    numbers[i] = sc.nextInt();
    if (numbers[i] < firstNumber){
         secondNumber=firstNumber;
         firstNumber = numbers[i];
         if (numbers[i] < firstNumber && numbers[i] != secondNumber){
             secondNumber = numbers[i];
         }
    }
} System.out.println(secondNumber);
    }
}