public class nqueens {

    public static boolean issafe(char borad[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (borad[i][col] == 'Q')
                return false;
        }

        // left side up daigolnal

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (borad[i][j] == 'Q') {
                return false;
            }
        }

        // right side up  daigolnal

        for (int i = row - 1, j = col + 1; i >= 0 && j < borad.length; i--, j++) {
            if (borad[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void nQueens(char borad[][], int row) {

        // base case
        if (row == borad.length) {
            printborad(borad);
            return;
        }

        // recrusion
        for (int j = 0; j < borad.length; j++) {
            if (issafe(borad, row, j)) {
                borad[row][j] = 'Q';
                nQueens(borad, row + 1); // funtion call
                borad[row][j] = 'X'; // backtracking
            }
        }
    }

    public static void printborad(char borad[][]) {

        System.out.println("------chessboard--------");

        for (int i = 0; i < borad.length; i++) {
            for (int j = 0; j < borad.length; j++) {
                System.out.print(borad[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char borad[][] = new char[4][4];

        // intialize borad
        for (int i = 0; i < borad.length; i++) {
            for (int j = 0; j < borad.length; j++) {
                borad[i][j] = 'X';
            }
        }
        nQueens(borad, 0);
    }
}
