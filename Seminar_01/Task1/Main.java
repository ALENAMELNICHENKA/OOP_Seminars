package Task1;
public class Main {

    public static void main(String[] args) {
        Cat animal = new Cat();
        Dog animal2 = new Dog();
        animal.setName("barsik");
        animal2.setName("sharik");
        animal.voice();
        animal2.voice();
        System.out.println(animal.getName());
        System.out.println(animal2.getName());
        animal.behaivour();
        animal2.behaivour();

    }
}