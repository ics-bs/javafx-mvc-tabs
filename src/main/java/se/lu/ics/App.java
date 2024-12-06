package se.lu.ics;

import javafx.stage.Stage;
import se.lu.ics.controllers.AppController;

public class App extends javafx.application.Application {
public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AppController appController = new AppController(primaryStage);
        appController.showMainView();
    }
}