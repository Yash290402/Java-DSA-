public class addingOne {
    public static int addOne(int num) {
        return -(~num);
        // ~num=1111 1010
        //-(~num)=-1111 1011
    }

    public static void main(String[] args) {
        int num = 5;
        int result = addOne(num);
        System.out.println("Original Number: " + num);
        System.out.println("Number after adding 1: " + result);
    }
}
