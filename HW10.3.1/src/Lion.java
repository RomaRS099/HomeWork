public class Lion extends Anymal{
    public Lion(String name) {
        super(name);
    }
@Override
    public void makeSound() {
        System.out.println(name + " рычит!");
}
}
