package se.lu.ics.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class AlphaTabController {
    
    @FXML
    public void handleAlphaButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alpha Tab");
        alert.setHeaderText(null);
        alert.setContentText("Alpha Button clicked in AlphaTabController!");
        alert.showAndWait();
    }
}
