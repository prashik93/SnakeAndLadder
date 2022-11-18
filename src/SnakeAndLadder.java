public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int FINAL_POSITION = 100;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problem");
        int positionOfPlayer = START_POSITION ;

        while (positionOfPlayer <= FINAL_POSITION) {
            double dieRoll = Math.floor(Math.random() * 10) % 6 + 1;
            double optionRoll = Math.floor(Math.random() * 10) % 3;
            System.out.println("Die roll : " + dieRoll);
            System.out.println("Option roll: " + optionRoll);
            switch ((int) optionRoll) {
                case LADDER ->
                    positionOfPlayer = positionOfPlayer + ((int) dieRoll);
                case SNAKE -> {
                    if (positionOfPlayer - ((int) dieRoll) < 0) {
                        positionOfPlayer = START_POSITION;
                    } else {
                        positionOfPlayer = positionOfPlayer - ((int) dieRoll);
                    }
                }
            }
        }
        System.out.println("Position of Player is : " + positionOfPlayer);
    }
}