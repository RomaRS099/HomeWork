import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Astana");
        map.put(2, "Almaty");
        map.put(3, "Karaganda");
        map.put(4, "Aktau");

        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(5));
    }
}