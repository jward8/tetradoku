package io.github.jward8.tetradoku.tetradoku;

public class Game {
    private String[][] board;

    public Game() {
        board = new String[9][9];
        generatePuzzle();
    }

    public void generatePuzzle() {
        // TODO: Initialize the board with a sample puzzle
    }

    public String getInitialValue(int row, int col) {
        return board[row][col] == null ? "" : board[row][col];
    }

    public boolean isMoveValid(int row, int col, String value) {
        return value.matches("[1-9]");
    }

    public void makeMove(int row, int col, String value) {
        board[row][col] = value;
    }

    public boolean isSolved(){
        return false;
    }
}
