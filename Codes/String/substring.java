public class substring {
    public static String getsubstring(String str, int start, int end) {
        String sunstr = "";
        for (int i = start; i < end; i++) {
            sunstr += str.charAt(i);

        }
        return sunstr;
    }

    public static void main(String[] args) {
        String str = "helloworld";
        // System.out.println(getsubstring(str, 0, 6));

        // also inbuilt function on java
        System.out.println(str.substring(0,5));
    }
}
