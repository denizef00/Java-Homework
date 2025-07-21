import java.util.Scanner;

public class Account {

    public long balance;

    /*deposit - withdraw - show balance*/

    public Account(long myBalance) {
        this.balance = myBalance;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value : ");
        long value = scanner.nextInt();
        balance = balance + value;

    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        if (balance == 0) {
            System.out.println("Your bank account is empty!!");
        } else {
            System.out.println("Please enter a value : ");
            long value = scanner.nextInt();
            while (true) {
                if (value <= balance) {
                    balance = balance - value;
                    break;
                } else {
                    System.out.println("Please give a valid number");
                }
            }
        }

    }

    public void show_balance() {
        System.out.println("Your balance is " + balance);
    }
}

