package Seminar_04.Task1;

public class Main {

     public static void main(String[] args) {

          BankAccount<Dollar> bankAcc = new BankAccount<Dollar>(new Dollar());
          bankAcc.getMoneyAmount().depositMoney(1000);
          bankAcc.getMoneyAmount().getMoney(175);
          System.out.println(bankAcc.getMoneyAmount());
     }
}
