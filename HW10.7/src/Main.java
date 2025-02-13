import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        ArrayList<String> colors1 = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");

        System.out.println(colors.equals(colors1));

        System.out.println(colors == colors1);
    }
}