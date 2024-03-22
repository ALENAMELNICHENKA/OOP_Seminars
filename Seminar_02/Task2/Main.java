package Seminar_02.Task2;

public class Main {
    public static void main(String[] args) {

        Human hum = new Human("Василий");

        Market market = new Market();
        
        market.acceptToMarket(hum);
        market.takeInQueue(hum);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(hum);
        
    }
    
}
