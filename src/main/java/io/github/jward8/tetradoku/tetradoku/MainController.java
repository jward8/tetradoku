package io.github.jward8.tetradoku.tetradoku;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainController {
    @FXML
    private GridPane gameGrid;

    private Game game;

    public void initialize() {
        game = new Game();
        setupGrid();
    }

    private void setupGrid() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                TextField cell = new TextField();
                cell.setPrefWidth(40);
                cell.setPrefHeight(40);
                cell.setText(game.getInitialValue(row, col));
                gameGrid.add(cell, col, row);
            }
        }
    }
}