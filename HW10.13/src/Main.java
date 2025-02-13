import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "BMW");
        cars.put(2, "Honda");
        cars.put(3, "Audi");
        cars.put(4, "Toyota");
        cars.put(5, "Subaru");

        HashMap<Integer, String> cars2 = new HashMap<>();
        cars2.putAll(cars);

        System.out.println("Оригинальный список: " + cars);
        System.out.println();
        System.out.println("Скопированный список: " + cars2);
    }
}