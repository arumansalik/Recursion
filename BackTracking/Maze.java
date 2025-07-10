package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3 ));
//        path("", 3, 3);
//        System.out.println(pathRetDiagonal("",3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        pathRestrictions("", board, 0, 0);
        allPath("", board, 0, 0);
    }
    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String s, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(s);
            return;
        }
        if(r > 1) {
            path(s + 'D', r - 1, c);
        }

        if(c > 1) {
            path(s + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if(r == 1 || c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }

        if(r > 1) {
            list.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }

        if(c > 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
    return list;
    }

    static void pathRestrictions(String s, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(s);
            return;
        }

        if(!maze[r][c]) {
            return;
        }
        if(r < maze.length - 1) {
            pathRestrictions(s + 'D', maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            pathRestrictions(s + 'R', maze, r, c + 1);
        }
    }

    static void allPath(String s, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(s);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        if(r < maze.length - 1) {
            allPath(s + 'D', maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            allPath(s + 'R', maze, r, c + 1);
        }

        if(r > 0) {
            allPath(s + 'U', maze, r - 1, c);
        }

        if(c > 0) {
            allPath(s + 'L', maze, r, c - 1);
        }
        maze[r][c] = true;
    }
}