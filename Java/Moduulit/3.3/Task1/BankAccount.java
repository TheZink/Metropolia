public class BankAccount {
    private static int accountCounter = 1;      // Vapaana oleva uniikki Id
    private static int accountTotal;            // Instanssin luontikerta
    private int accountId;                      // Uniikki Id
    protected int accountBalance;               // Tilin saldo

    public BankAccount(int accountBalance) {
        accountId = accountCounter++;           // Jokainen tili saa oman uniikin ID
        accountTotal++;                         // Kasvatetaan instanssin luontikerta
        this.accountBalance = accountBalance;
    }

    int deposit(int amount) {                   // Kasvattaa tilin saldoa
        accountBalance += amount;
        return accountBalance;
    }

    int withdraw(int amount) {                  // Pienetää tilin saldoa
        accountBalance -= amount;
        return accountBalance;
    }

    int getAccountNumber() {                     // Palautetaan tilin Id
        return accountId;
    }

    int getBalance() {                          // Palauttaa tilin saldon
        return accountBalance;
    }

    static int getTotalAccounts() {             // Palauttaa tilien lukumäärän
        return accountTotal;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        BankAccount account3 = new BankAccount(2000);
        BankAccount account4 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(1500);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());
        System.out.println("Account " + account3.getAccountNumber() + " balance: " + account3.getBalance());
        System.out.println("Account " + account4.getAccountNumber() + " balance: " + account4.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}