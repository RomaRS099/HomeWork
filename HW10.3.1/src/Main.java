//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Lion lion = new Lion("Симба");
    Dog dog = new Dog("Хатико");

    dog.eat();
    dog.makeSound();

    lion.eat();
    lion.makeSound();
    }
}