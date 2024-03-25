package Seminar_04.Task1;

public class Money {

    protected int amountMoney;

    //метод снять деньги, в аргументах будем принимать какую-то суму денег
    void getMoney(int amount) {
        amountMoney = amountMoney - amount;
        }

    //метод пополнения денег
    void depositMoney(int amount) {
        amountMoney = amountMoney + amount;
    }
    
}
