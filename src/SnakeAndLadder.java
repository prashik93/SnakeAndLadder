public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int FINAL_POSITION = 100;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problem");
        int positionOfPlayer = START_POSITION ;

        while (positionOfPlayer < FINAL_POSITION) {
            int dieRoll = generateRandomDie(6,1);
            int optionRoll = generateRandomDie(3,1);

            switch ((int) optionRoll) {
                case LADDER -> {
                    positionOfPlayer = positionOfPlayer + ((int) dieRoll);
                    if (positionOfPlayer > FINAL_POSITION) {
                        positionOfPlayer = positionOfPlayer - ((int) dieRoll);
                    }
                }
                case SNAKE -> {
                    if (positionOfPlayer - ((int) dieRoll) < START_POSITION) {
                        positionOfPlayer = START_POSITION;
                    } else {
                        positionOfPlayer = positionOfPlayer - ((int) dieRoll);
                    }
                }
            }
        }
        System.out.println("Position of Player is : " + positionOfPlayer);
    }

    public static int generateRandomDie (int max, int min) {
        int dieRoll = (int)Math.floor(Math.random() * 10) % max + min;
        return dieRoll;
    }
}