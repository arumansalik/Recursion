package Example;

import java.util.*;

public class NQueens {
    static List<List<String>> result;
    static boolean[] cols;
    static boolean[] diag;
    static boolean[] antiDiag;
    static char[][] board;
    static int n;

    public static List<List<String>> solveNQueens(int N) {
        n = N;
        result = new ArrayList<>();
        cols = new boolean[n];
        diag = new boolean[2 * n];
        antiDiag = new boolean[2 * n];
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0);

        return result;
    }

    private static void backtrack(int row) {
        if(row == n) {
            result.add(construct());
            return;
        }

        for(int col = 0; col < n; col++) {
            int d = row - col + n;
            int ad = row + col;

            if(cols[col] || diag[d] || antiDiag[ad]) continue;

            board[row][col] = 'Q';
            cols[col] = diag[d] = antiDiag[ad] = true;

            backtrack(row + 1);

            board[row][col] = '.';
            cols[col] = diag[d] = antiDiag[ad] = false;
        }
    }

    private static List<String> construct() {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> ans = solveNQueens(4);
        for (List<String> sol : ans) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
