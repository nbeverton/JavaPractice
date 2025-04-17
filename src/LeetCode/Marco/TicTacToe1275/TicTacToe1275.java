package LeetCode.Marco.TicTacToe1275;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe1275 {
    public String tictactoe(int[][] moves){

        List<int[]> aMoves = new ArrayList<>();
        List<int[]> bMoves = new ArrayList<>();

        int[][][] winCombinations = {
                {{0, 0}, {0, 1}, {0, 2}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{2, 0}, {2, 1}, {2, 2}},
                {{0, 0}, {1, 0}, {2, 0}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 2}, {1, 2}, {2, 2}},
                {{0, 0}, {1, 1}, {2, 2}},
                {{0, 2}, {1, 1}, {2, 0}}
        };

        for (int i = 0; i < moves.length; i++) {
            if (i % 2 != 0){
                aMoves.add(moves[i]);
            } else {
                bMoves.add(moves[i]);
            }
        }

        if (hasWon(aMoves, winCombinations)) {
            return "B";
        }

        if (hasWon(bMoves, winCombinations)) {
            return "A";
        }

        return moves.length == 9 ? "Draw" : "Pending";

    }

    private boolean hasWon(List<int[]> playerMoves, int[][][] winCombinations) {
        for (int[][] combination : winCombinations) {
            boolean hasCombination = true;
            for (int[] pos : combination) {
                if (!containsMove(playerMoves, pos)) {
                    hasCombination = false;
                    break;
                }
            }
            if (hasCombination) {
                return true;
            }
        }
        return false;
    }

    private boolean containsMove(List<int[]> moves, int[] position) {
        for (int[] move : moves) {
            if (move[0] == position[0] && move[1] == position[1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe1275 ticTacToe1275 = new TicTacToe1275();

        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        System.out.println(ticTacToe1275.tictactoe(moves));
    }
}
