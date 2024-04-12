public class largest {
    public static void main(String[] args) {


        // lexical rite compare karse
        
        String fruit[] = { "apple", "orange", "mango" };
        String largest = fruit[0];
        for (int i = 0; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }

        System.out.println(largest);
    }
}
