import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("orange");
        System.out.println("Исходный список: " + colors);
        colors.set(1, "purple");
        colors.set(4, "black");
        System.out.println("Обновленный список: " + colors);
    }
}