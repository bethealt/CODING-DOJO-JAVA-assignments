package BANKINGJAVA;
import java.util.Random;

public class BankAccount {
    private long accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    
    private static int numberOfAccounts = 0;
    private static Double totalBankBalance = 0.0;

    private long generateAccountNumber() {
      Random r = new Random();
      accountNumber = r.nextLong();
      //((9999999999L - 1111111111L)) + 1111111111L;
      return accountNumber;
    }

    //CONSTRUCTOR
    public BankAccount () {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = this.generateAccountNumber();
        numberOfAccounts ++;
    }

    //GETTERS & SETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalBankBlance() {
        return totalBankBalance;
    }
    
    //METHODS
    String chk = "checking";
    String sav = "savings";

    //allow a user to deposit money into either the checking or saving
    public double makeDeposit (String accountType, double deposit) {
        if (accountType == chk) {
            double updatedChkBalance = checkingBalance += deposit;
            totalBankBalance += deposit;
            return updatedChkBalance;
        }
        else if (accountType == sav) {
            double updatedSavBalance = savingsBalance += deposit;
            totalBankBalance += deposit;
            return updatedSavBalance;
        }
        return totalBankBalance;
    }   

    public double makeWithdrawal (String accountType, double withdrawal) {
        if (accountType == chk) {
            if (checkingBalance < withdrawal) {
                System.out.println("Transaction declined. Insufficient funds.");
                withdrawal = 0.0;
            }
            double updatedChkBalance = checkingBalance -= withdrawal;
            totalBankBalance -= withdrawal;
            return updatedChkBalance;
        }
        else if (accountType == sav) {
            if (savingsBalance < withdrawal) {
                System.out.println("Transaction declined. Insufficient funds.");
                withdrawal = 0.0;
            }
            double updatedSavBalance = savingsBalance -= withdrawal;
            totalBankBalance -= withdrawal;
            return updatedSavBalance;
        }
        return totalBankBalance;
    }

    //total money from the checking and saving
    public double accountBalances() {
       Double totalBalance = checkingBalance + savingsBalance;
       System.out.printf("\n Checking Account Balance: %s0", checkingBalance);
       System.out.printf("\n Savings Account Balance: %s0", savingsBalance);
       System.out.printf("\n Total Account Balances: %s0 \n", totalBalance);
       return totalBalance;
    }


}
