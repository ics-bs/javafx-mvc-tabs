package se.lu.ics.controllers;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class AppController {
    private final Stage primaryStage;

    public AppController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showMainView() {
        try {
            // Get the location of the MainView.fxml file which defines the layout of the
            // GUI
            // The location is relative to the root of the classpath (target/classes)
            URL location = getClass().getResource("/fxml/MainView.fxml");

            // Create a new FXMLLoader with the location of the FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(location);

            // Load the FXML file to create the UI layout as defined in MainView.fxml
            TabPane root = fxmlLoader.load();

            // Get the controller associated with the FXML file
            // that has been automatically instantiated by the FXMLLoader
            MainViewController controller = fxmlLoader.getController();

            controller.setAppController(this);

            // Create a scene with the root node and set it on the primary stage
            Scene scene = new Scene(root, 800, 600);

            primaryStage.setTitle("JavaFX MVC Tabs Example");
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}