import java.util.Scanner;

public class Nim_pvp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stone = 15;
        int current_player = 1;

        while(stone > 0){
            System.out.println("Number of stone : " + stone);
            System.out.println("Player " + current_player + " choose how many stones to get: ");
            int move = scanner.nextInt();

            if (move < 1 || move > 3){
                System.out.println("Invalid move !!! Please choose 1, 2 or 3");
                continue;
            }

            if (move> stone){
                System.out.println("There aren't that many stones left!");
                continue;
            }

            stone -= move;

            if(stone == 0){
                System.out.println("YOU WON PLAYER " + current_player + " !!! You took last stone!!");
                break;
            }

            current_player = (current_player == 1) ? 2 : 1;
        }
    }
}
