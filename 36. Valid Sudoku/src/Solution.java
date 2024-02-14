public class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            boolean[] isValidRow = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int boardValue = board[i][j] - '0'; // Converts '5' to 5
                    if (isValidRow[boardValue - 1])
                        return false;
                    else
                        isValidRow[boardValue - 1] = true;
                }
            }
            // System.out.println(i + 1 + " row done");
        }

        for (int j = 0; j < 9; j++) {
            boolean[] isValidCol = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int boardValue = board[i][j] - '0'; // converts 'char' digit to 'int'
                    if (isValidCol[boardValue - 1])
                        return false;
                    else
                        isValidCol[boardValue - 1] = true;
                }
            }
            System.out.println(j + 1 + " col done");
        }
        return true;
    }
}
