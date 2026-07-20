package Day11.Classtask;


public class BankingTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        System.out.println(b1.balance = 1000);
    }

    static class BankAccount {
        String accountholdername;
        int account;
        float balance;

        public void deposit(float amount) {
            balance = balance + amount;
            System.out.println("Amount deposited " + amount + " Rs" + " Balance " + balance);
        }

        public void withdraw(float amount) {
            balance = balance - amount;
            System.out.println("Amount withdrawn " + amount + " Rs" + " Balance " + balance);
        }
    }
}