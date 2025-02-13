import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Роман", 9));
        students.add(new Students("Тахир", 7));
        students.add(new Students("Мария", 10));
        students.add(new Students("Володя", 6));

        System.out.println("Имена студентов и их оценки: ");
        for (Students student : students) {
            student.displayInfo();
        }
    }
}