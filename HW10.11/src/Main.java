import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");

        System.out.println("Исходный первый список: " + fruits);
        HashSet<String> fruits2 = new HashSet<>();
        fruits2.add("apple");
        fruits2.add("mango");
        fruits2.add("dragon fruit");
        fruits2.add("banana");

        System.out.println("Исходный второй список: " + fruits2);

        fruits.retainAll(fruits2);

        System.out.println("Список с одинаковыми элементами из 2 списков: " + fruits);
    }
}