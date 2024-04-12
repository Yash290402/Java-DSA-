public class butterfly {
    public static void main(String[] args) {
        // 1st half
        for (int i = 1; i <= 4; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space

            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half

        for (int i = 4; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space

            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
