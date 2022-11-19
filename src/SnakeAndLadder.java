import java.util.ArrayList;

public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int FINAL_POSITION = 100;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problem");
        int positionOfPlayer = START_POSITION ;
        ArrayList<Integer> rollCountArray = new ArrayList<> ();

        while (positionOfPlayer < FINAL_POSITION) {
            int dieRoll = generateRandomNumber(6, 1);
            int optionRoll = generateRandomNumber(3, 1);

            switch (optionRoll) {
                case LADDER -> {
                    positionOfPlayer = positionOfPlayer + dieRoll;
                    if (positionOfPlayer > FINAL_POSITION) {
                        positionOfPlayer = positionOfPlayer - dieRoll;
                    }
                }
                case SNAKE -> {
                    positionOfPlayer = positionOfPlayer - dieRoll;
                    if (positionOfPlayer - dieRoll < START_POSITION) {
                        positionOfPlayer = START_POSITION;
                    }
                }
                default -> positionOfPlayer = positionOfPlayer;
            }
            rollCountArray.add(positionOfPlayer);
        }
        System.out.println("Final position of Player is : " + positionOfPlayer);
        System.out.println("Position after every die roll is : " + rollCountArray);
        System.out.println("Number of times the die was played to win the game is : " + rollCountArray.size());
    }

    public static int generateRandomNumber(int maxRange, int minRange) {
        return (int) Math.floor(Math.random() * 10) % maxRange + minRange;
    }
}