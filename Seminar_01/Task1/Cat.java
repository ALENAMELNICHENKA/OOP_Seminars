package Task1;

public class Cat extends Animal implements AnimalBehaivour{
    //в этом классе можно переопределить метод voice из Animal
    public void voice() {
        System.out.println("мяу");
    }

    public void test() {

    }

    public void behaivour() {
        System.out.println("Кошка охотится на мышей");
    }
    
}
