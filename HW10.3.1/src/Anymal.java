public abstract class Anymal {
    protected String name;
    public Anymal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " ест пищу!");
    }
    public abstract void makeSound();
}
