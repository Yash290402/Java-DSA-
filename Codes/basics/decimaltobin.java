public class decimaltobin {

    public static void decitobin(int n) {
        int pow = 0;
        int binNum = 0;
        int myNum=n;
       
        while (n > 0) {
            int lastdigit = n % 2;
            binNum = binNum + (lastdigit * (int) (Math.pow(10, pow)));
            pow++;
            n =n / 2;
        }
        System.out.println("Decimal to Binary " +myNum + " = " + binNum );
    }

    public static void main(String[] args) {
        decitobin(7);
    }

}
