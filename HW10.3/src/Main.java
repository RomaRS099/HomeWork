//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Move human = new Human();
    Move airPlane = new AirPlane();
    Move car = new Car();
    human.move();
    airPlane.move();

    }
}