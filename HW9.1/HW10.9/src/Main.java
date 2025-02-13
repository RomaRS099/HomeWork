import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Январь");
        list.add("Февраль");
        list.add("Март");
        list.add("Апрель");
        list.add("Май");
        list.add("Январь");

        String findElement = "Январь";
        int first = list.indexOf(findElement);
        int last = list.lastIndexOf(findElement);

        System.out.println("Певое значение элемента: " + findElement + " " + first);
        System.out.println("Последнее значение элемента: "+ findElement + " " + last);

    }
}