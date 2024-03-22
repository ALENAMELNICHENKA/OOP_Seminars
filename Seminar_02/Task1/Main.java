package Seminar_02.Task1;

public class Main {
    public static void main(String[] args) {

        Human hum = new Human("Василий");
        System.out.println(hum.getName());
        System.out.println(hum.isMakeOrder);
        System.out.println(hum.isTakeOrder);
        hum.setMakeOrder();
        hum.setTakeOrder();
        System.out.println(hum.isMakeOrder);
        System.out.println(hum.isTakeOrder);
    }
    
}
