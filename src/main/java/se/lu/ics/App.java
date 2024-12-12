package se.lu.ics;

import javafx.stage.Stage;
import models.AppModel;
import se.lu.ics.controllers.AppController;

public class App extends javafx.application.Application {
public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AppModel appModel = new AppModel();
        AppController appController = new AppController(primaryStage, appModel);
        appController.showMainView();
    }
}