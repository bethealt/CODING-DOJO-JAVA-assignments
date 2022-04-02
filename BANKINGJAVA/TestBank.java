package BANKINGJAVA;

public class TestBank {

    public static void main(String[] args) {

    System.out.println("\n===== BANKING JAVA =====");  

    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();

    System.out.println("\n----- Deposit Test -----");
    String chk = "checking";
    String sav = "savings";

    account1.makeDeposit(chk, 100.0);
    account1.makeDeposit(sav, 25.0);
    account2.makeDeposit(chk, 75.0);
    account2.makeDeposit(sav, 25.0);
    account3.makeDeposit(sav, 50.0);
    account3.makeDeposit(chk, 125.0);

    System.out.println("\n----- Withdrawal Test -----");

    account1.makeWithdrawal(sav, 30.0);
    account2.makeWithdrawal(chk, 25.0);
    account3.makeWithdrawal(chk, 150.0);

    System.out.println("\n----- Display Test -----");

    account1.accountBalances();
    account2.accountBalances();
    account3.accountBalances();

    System.out.println("\n----- Bank Profile Test -----");

    System.out.printf("Patronage: %s", BankAccount.getNumberOfAccounts());
    System.out.printf("\nHoldings: %s", BankAccount.getTotalBankBlance());

    }
}
