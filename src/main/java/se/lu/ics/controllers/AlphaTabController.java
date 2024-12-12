package se.lu.ics.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import models.AppModel;

public class AlphaTabController {

    private AppModel appModel;
    
    @FXML
    public void handleAlphaButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alpha Tab");
        alert.setHeaderText(null);
        alert.setContentText("Alpha Button clicked in AlphaTabController!");
        alert.showAndWait();
    }

    public void setAppModel(AppModel appModel) {
        this.appModel = appModel;
    }
}
