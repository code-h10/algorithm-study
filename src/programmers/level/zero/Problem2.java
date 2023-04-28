package programmers.level.zero;

public class Problem2 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int answer = 0;
        int positionX = 0;
        int positionY = 0;
        int length = board.length-1;

        for(int y = 0; y < board.length; y++) {
            for(int x = 0; x < board[y].length; x++) {
                if(board[y][x] == 1) {

                    if(y-1 >= 0) {
                        if(isOne(board, y-1, x)) {
                            board[y-1][x] = 2;
                        }
                        if(x-1 >= 0) {
                            if(isOne(board, y-1, x-1)) {
                                board[y-1][x-1] = 2;
                            }
                        }
                        if(x+1 <= length){
                            if(isOne(board, y-1, x+1)) {
                                board[y-1][x+1] = 2;
                            }
                        }
                    }

                    if(y+1 <= length) {
                        if(isOne(board, y+1, x)) {
                            board[y+1][x] = 2;
                        }
                        if(x+1 <= length) {
                            if(isOne(board, y+1, x+1)) {
                                board[y+1][x+1] = 2;
                            }
                        }
                        if(x-1 >= 0){
                            if(isOne(board, y+1, x-1)) {
                                board[y+1][x-1] = 2;
                            }
                        }
                    }

                    if(x-1 >= 0) {
                        if(isOne(board, y, x-1)) {
                            board[y][x-1] = 2;
                        }
                    }

                    if(x+1 <= length) {
                        if(isOne(board, y, x+1)) {
                            board[y][x+1] = 2;
                        }
                    }
                }
            }
        }

        for(int k = 0; k < board.length; k++) {
            for(int m = 0; m < board[k].length; m++) {
                if(board[k][m] == 0) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean isOne(int[][] board, int y, int x) {
        if(board[y][x] == 0) {
            return true;
        } else {
            return false;
        }

    }
}