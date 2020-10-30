package DefiningClassesLab.BankAccount;

public class BankAccount {
    private static int currentId = 1;
    private static double DEFAULT_INTEREST_RATE = 0.02;
    private int id;
    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    public BankAccount() {
        this.id = currentId++;
        System.out.println("Account ID" + this.id + " created");
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int Years) {

        return this.balance * Years * BankAccount.interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposited %.0f to ID%d%n", amount, this.id);

    }


}
