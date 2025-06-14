import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMProject {
    static class Transaction {
        private String type;
        private double amount;
        private String timestamp;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = getCurrentTimestamp();
        }

        private String getCurrentTimestamp() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return LocalDateTime.now().format(formatter);
        }

        @Override
        public String toString() {
            return timestamp + " - " + type + ": " + amount;
        }
    }

    static class Account {
        String name;
        int accountNumber;
        double balance;
        ArrayList<Transaction> transactionHistory;

        public Account(String name) {
            this.name = name;
            this.accountNumber = generateAccountNumber();
            this.balance = 0.0;
            this.transactionHistory = new ArrayList<>();
        }

        private int generateAccountNumber() {
            Random random = new Random();
            return 10000 + random.nextInt(90000); // 5-digit random account number
        }

        public String getName() {
            return name;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Deposit successful! New balance: " + balance);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                transactionHistory.add(new Transaction("Withdraw", amount));
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        }

        public void showTransactionHistory() {
            if (transactionHistory.isEmpty()) {
                System.out.println("No transactions found.");
            } else {
                System.out.println("Transaction History:");
                for (Transaction t : transactionHistory) {
                    System.out.println(t);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Simulation!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Account account = new Account(name);
        System.out.println("Hello, " + name + "! Your account number is: " + account.getAccountNumber());

        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

}
