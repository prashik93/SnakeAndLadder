public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problem");
        double dieRoll = Math.floor(Math.random() * 10) % 6 + 1;
        double optionRoll = Math.floor(Math.random() * 10) % 3;
        int positionOfPlayer = START_POSITION ;
        System.out.println("Die roll : " + dieRoll);
        System.out.println("Option roll: " + optionRoll);

        switch ((int) optionRoll) {
            case LADDER ->
                positionOfPlayer = positionOfPlayer + ((int) dieRoll);
            case SNAKE ->
                positionOfPlayer = positionOfPlayer - ((int) dieRoll);
        }
        System.out.println("Position of Player is : " + positionOfPlayer);
    }
}