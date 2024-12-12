package se.lu.ics.controllers;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import models.AppModel;

public class AppController {
    private final Stage primaryStage;
    private final AppModel appModel;

    public AppController(Stage primaryStage, AppModel appModel) {
        this.primaryStage = primaryStage;
        this.appModel = appModel;
    }

    public void showMainView() {
        try {
            URL location = getClass().getResource("/fxml/MainView.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(location);

            TabPane root = fxmlLoader.load();
            MainViewController controller = fxmlLoader.getController();
            controller.setAppController(this);
            controller.setAppModel(appModel);
            
            Scene scene = new Scene(root, 800, 600);

            primaryStage.setTitle("JavaFX MVC Tabs Example");
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}