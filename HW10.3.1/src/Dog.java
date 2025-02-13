public class Dog extends Anymal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " лает!");
    }
}
