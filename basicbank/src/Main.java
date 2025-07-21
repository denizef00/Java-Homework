
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your balance");
        long value = scanner.nextInt();
        Account bank = new Account(value);

        screen(bank);
        }

    public static void screen(Account bank){
        System.out.println("Welcome to the Farming Bank");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------MENU---------");
            System.out.println("1.Deposit\n2.Withdraw\n3.Show Balance\n4.Exit");
            int choose = scanner.nextInt();

            if (choose == 1){
                bank.deposit();
            }
            else if (choose == 2){
                bank.withdraw();
            }

            else if (choose == 3) {
                bank.show_balance();
            }
            else if (choose == 4) {
                System.out.println("Quitted!!");
                break;
            }
            else{
                System.out.println("Invalid Command!!");
            }
        }

    }



}
