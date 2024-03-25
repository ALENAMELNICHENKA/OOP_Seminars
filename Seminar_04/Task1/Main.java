package Seminar_04.Task1;

public class Main {

     public static void main(String[] args) {

          BankAccount<Dollar> bankAcc = new BankAccount<Dollar>(new Dollar());
          bankAcc.getMoneyAmount().depositMoney(200);
          bankAcc.getMoneyAmount().getMoney(175);
          System.out.println(bankAcc.getMoneyAmount());

          BankAccount<Euro> bankAcc2 = new BankAccount<Euro>(new Euro());
          bankAcc2.getMoneyAmount().depositMoney(300);
          bankAcc2.getMoneyAmount().getMoney(175);
          System.out.println(bankAcc2.getMoneyAmount());
     }
}
