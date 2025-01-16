//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Student student = new Student("Roman", 99);
System.out.println("Name: " + student.getName());
System.out.println("ID: " + student.getId());

student.incrementAgeStudy();
System.out.println("Year: " + student.getAgeStudy());
    }
}