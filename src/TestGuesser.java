public class TestGuesser {

    public static void main(String[] args) {
        Guesser p1 = new Guesser(0, 1000);

        if (p1.toString().equals("low: 0 high: 1000")) {
            System.out.println("Test with 0, 1000 passed!");
        } else {
            System.err.println("Test with 0, 1000 failed!");
        }

        Guesser p2 = new Guesser(0,1);

        if (p2.toString().equals("low: 0 high: 1")) {
            System.out.println("Test with 0, 1 passed!");
        } else {
            System.err.println("Test with 0, 1 failed!");
        }

        Guesser p3 = new Guesser(100, 101);

        if (p3.toString().equals("low: 100 high: 101")) {
            System.out.println("Test with 0, 101 passed!");
        } else {
            System.err.println("Test with 0, 101 failed!");
        }

        Guesser p4 = new Guesser(-5, 20);
    }
}
