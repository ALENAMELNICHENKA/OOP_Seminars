package Seminar_02.Task2;

public class Human extends Actor{

    @Override
    String getName() {
        return name;
    }

    public Human(String name){
        this.name = name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        
    }
    
    
}
