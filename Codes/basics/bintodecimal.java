
public class bintodecimal {

    public static void bintodeci(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {

            int lastdigi = binNum % 10;
            decNum = decNum + (lastdigi * (int) (Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;

        }

        System.out.println("my conversion " + myNum + " = "  + decNum);
    }

    public static void main(String[] args) {
        bintodeci(101);
    }

}
