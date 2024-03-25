package Seminar_04.Task1;

public class BankAccount<T extends Money> {

    private T moneyAmount;

    public BankAccount(T moneyAmount){
        this.moneyAmount = moneyAmount;
    }

    public T getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(T moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    
}
