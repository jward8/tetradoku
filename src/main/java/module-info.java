module io.github.jward8.tetradoku.tetradoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.jward8.tetradoku.tetradoku to javafx.fxml;
    exports io.github.jward8.tetradoku.tetradoku;
}