public class SnakeAndLadder {

    static final int START_POSITION = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Problem");
        double random = Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Result after rolling the die : " + random);
    }
}