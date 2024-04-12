public class swap {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("before swap:X=" + x + "and y= " + y);

        // swap using XOR
        x = x ^ y;
        // System.out.print(x); //7
        y = x ^ y;
        // System.out.print(y); //3
        x = x ^ y;
        // System.out.print(x);  //4
        
        System.out.println("after swap:X=" + x + "and y= " + y);
    }

}
