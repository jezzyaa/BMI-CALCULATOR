package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Memuat berkas desain visual dari SceneBuilder
        Parent root = FXMLLoader.load(getClass().getResource("/com/bmiapp/view/BMIView.fxml"));
        
        primaryStage.setTitle("BMI Calculator - JavaFX GUI");
        primaryStage.setScene(new Scene(root, 380, 420));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}