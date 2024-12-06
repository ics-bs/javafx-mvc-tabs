package se.lu.ics.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class CharlieTabController {
    
    @FXML
    public void handleCharlieButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Charlie Tab");
        alert.setHeaderText(null);
        alert.setContentText("Charlie Button clicked in CharlieTabController!");
        alert.showAndWait();
    }
}