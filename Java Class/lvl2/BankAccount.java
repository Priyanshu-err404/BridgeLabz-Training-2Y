class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String holder, long number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    void show() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Rishi", 1111L, 5000);
        a.deposit(2000);
        a.withdraw(1500);
        a.show();
    }
}
