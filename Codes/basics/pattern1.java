
public class pattern1 {
    public static void main(String[] args) {

        // // for star patterns
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }

        // System.out.println();
        // }

        // for inverted star patterns

        // for (int i = 4; i >= 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }



        // for characters print 
        char ch = 'A';

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

    }
}
