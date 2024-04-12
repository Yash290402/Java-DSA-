
public class shortest {

    public static float getshortestpath(String path) {
        int x=0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);

            // North
            if (dir == 'n') {
                y++;

            }
            // south
            else if (dir == 's') {
                y--;
            }
            // west
            else if (dir == 'w') {
                x--;
            }
            // east
            else {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "wneenesennn";

        System.out.println(getshortestpath(path));
    }
}
