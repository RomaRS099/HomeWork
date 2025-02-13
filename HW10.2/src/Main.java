//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkDayType(Weekday day) {
    if(day.isWeekday()) {
        System.out.println(day + " это рабочий день!");
    } else {
        System.out.println(day + " этот день выходной!");
    }
    }

    public static void main(String[] args) {
    for (Weekday day : Weekday.values()) {
        checkDayType(day);
    }
    }
}
