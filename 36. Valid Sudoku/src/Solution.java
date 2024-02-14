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

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValid3x3Sudoku(board, i, j))
                    return false;
            }
        }
        return true;
    }

    boolean isValid3x3Sudoku(char[][] board, int row, int col) {
        boolean[] isValid3x3 = new boolean[9];

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    int boardValue = board[i][j] - '0'; // converts 'char' digit to 'int'
                    if (isValid3x3[boardValue - 1])
                        return false;
                    else
                        isValid3x3[boardValue - 1] = true;
                }
            }
        }
        return true;
    }
}
