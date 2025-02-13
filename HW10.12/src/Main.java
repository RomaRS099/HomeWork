import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        set.add("C");

        if (set.isEmpty()) {
            System.out.println("Список пустой!");
        } else {
            System.out.println(set);
        }
    }
}