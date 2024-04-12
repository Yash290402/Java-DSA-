
public class linearsearch {

    public static int linsearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 2, 5, 4, 6, 7, 8, 10 };
        int key = 10;
        int index = linsearch(marks, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is found at index " + index);
        }

    }
}
