package Example;

import java.util.*;

public class NQueens {
    List<List<String>> result = new ArrayList<>();
    char[][] board;
    int n;

    boolean[] cols;
    boolean[] diag;
    boolean[] antiDiag;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        board = new char[n][n];
        cols = new boolean[n];
        diag = new boolean[2 * n];
        antiDiag = new boolean[2 * n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        backtrack(0);
        return result;
    }

    private void backtrack(int row) {
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            int d = row - col + n;
            int ad = row + col;

            if (cols[col] || diag[d] || antiDiag[ad])
                continue;

            board[row][col] = 'Q';
            cols[col] = diag[d] = antiDiag[ad] = true;

            backtrack(row + 1);

            board[row][col] = '.';
            cols[col] = diag[d] = antiDiag[ad] = false;
        }
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            res.add(new String(board[i]));
        return res;
    }
}

class Solution {

}
