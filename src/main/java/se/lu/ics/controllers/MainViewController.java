package se.lu.ics.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import models.AppModel;

public class MainViewController {
    private AppController appController;
    private AppModel appModel;

    @FXML
    private TabPane tabPane;

    private boolean isTabsInitialized = false;

    private void initializeTabs() {
        try {
            // Access and load AlphaTab manually
            FXMLLoader alphaLoader = new FXMLLoader(getClass().getResource("/fxml/AlphaTab.fxml"));
            AnchorPane alphaContent = alphaLoader.load();
            AlphaTabController alphaController = alphaLoader.getController();
            alphaController.setAppModel(appModel);
            tabPane.getTabs().get(0).setContent(alphaContent);

            // Access and load BravoTab manually
            FXMLLoader bravoLoader = new FXMLLoader(getClass().getResource("/fxml/BravoTab.fxml"));
            AnchorPane bravoContent = bravoLoader.load();
            BravoTabController bravoController = bravoLoader.getController();
            bravoController.setAppModel(appModel);
            tabPane.getTabs().get(1).setContent(bravoContent);

            // Access and load CharlieTab manually
            FXMLLoader charlieLoader = new FXMLLoader(getClass().getResource("/fxml/CharlieTab.fxml"));
            AnchorPane charlieContent = charlieLoader.load();
            CharlieTabController charlieController = charlieLoader.getController();
            charlieController.setAppModel(appModel);
            tabPane.getTabs().get(2).setContent(charlieContent);

        } catch (Exception e) {
            // TODO: Implement proper error handling
        }
    }

    public void setAppController(AppController appController) {
        this.appController = appController;
    }

    public void setAppModel(AppModel appModel) {
        this.appModel = appModel;

        // Prevent duplicate tab loading
        if (!isTabsInitialized) {
            initializeTabs();
            isTabsInitialized = true; 
        }
    }
}