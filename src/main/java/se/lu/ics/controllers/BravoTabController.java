package se.lu.ics.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class BravoTabController {
    
    @FXML
    public void handleBravoButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bravo Tab");
        alert.setHeaderText(null);
        alert.setContentText("Bravo Button clicked in BravoTabController!");
        alert.showAndWait();
    }
}