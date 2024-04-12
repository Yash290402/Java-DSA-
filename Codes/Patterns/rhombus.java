public class rhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // space
            for (int j = 1; j <= (4 - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}