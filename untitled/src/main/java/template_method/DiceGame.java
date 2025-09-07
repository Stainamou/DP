package template_method;

import java.util.Random;

public class DiceGame extends Game {
    private int[] scores;
    private int rounds;
    private int currentRound;
    private Random random = new Random();

    @Override
    public void initializeGame(int numberOfPlayers) {
        scores = new int[numberOfPlayers];
        rounds = 5;
        currentRound = 0;
        System.out.println("Starting a new Dice Game with " + numberOfPlayers + " players");
    }

    @Override
    public boolean endOfGame() {
        return currentRound >= rounds;
    }

    @Override
    public void playSingleTurn(int player) {
        int player1Roll = random.nextInt(6) + 1;
        int player2Roll = random.nextInt(6) + 1;
        System.out.println("Round " + (currentRound + 1) + ":");
        System.out.println("Player 1 rolls: " + player1Roll);
        System.out.println("Player 2 rolls: " + player2Roll);
        if (player1Roll > player2Roll) {
            scores[0]++;
            System.out.println("Player 1 wins the round!");
        } else if (player2Roll > player1Roll) {
            scores[1]++;
            System.out.println("Player 2 wins the round!");
        } else {
            System.out.println("It's a tie!");
        }
        currentRound++;
    }

    @Override
    public void displayWinner() {
        if (scores[0] > scores[1]) {
            System.out.println("Player 1 wins the game with score: " + scores[0]);
        } else if (scores[1] > scores[0]) {
            System.out.println("Player 2 wins the game with score: " + scores[1]);
        } else {
            System.out.println("The game ends in a tie!");
        }
    }
}
