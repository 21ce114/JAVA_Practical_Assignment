//Created By 21CE114 Harsh Rana.
package Practical1;

public class TestAccount {
    public static void main(String[] args) {

        Account Ac = new Account(114, 20000);
        Ac.setAnnualInterestRate(7.5);
        Ac.withdraw(5000);
        Ac.deposit(3000);
        Ac.setDateCreated("20/10/2003");

        System.out.println("Balance: " + Ac.getBalance());
        System.out.println("Monthly Interest: " + Ac.getMonthlyInterest());
        System.out.println("Date Created: " + Ac.getDateCreated());

    }

}
