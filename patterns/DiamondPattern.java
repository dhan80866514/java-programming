public class DiamondPattern {

    public static void main(String[] args) {

        // Upper half
        for (int row = 1; row <= 5; row++) {

            // Print spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = 4; row >= 1; row--) {

            // Print spaces
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}