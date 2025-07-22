import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int stone = 15;
        boolean playerTurn = true;

        while(stone > 0){
            System.out.println("Number of stones: " + stone);

            if(playerTurn){
                System.out.println("Choose how many stones to get: ");
                int playerMove = scanner.nextInt();

                if(playerMove < 1 || playerMove > 3){
                    System.out.println("Invalid move!!! Please choose 1,2 or 3 stone");
                    continue;
                }
                if(playerMove > stone){
                    System.out.println("There aren't that many stones left!");
                    continue;
                }

                stone -= playerMove;

            }else{
                int computerMove = smartMove(stone);
                System.out.println("Computer took " + computerMove + " stone(s)");
                stone -= computerMove;
            }

            if(stone == 0 ){
                if(playerTurn){
                    System.out.println("YOU WON !!!! You took last stone!!");
                }else{
                    System.out.println("COMPUTER WON!!! Computer took last stone!!");
                }
                break;
            }

            playerTurn = !playerTurn;
        }
    }

    public static int smartMove(int stones) {
        if (stones % 4 == 0) {
            return 1 + new Random().nextInt(3);
        } else {
            return stones % 4; // Kazandıracak en iyi hamleyi yap
        }
    }

}
