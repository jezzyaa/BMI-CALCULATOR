package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Pemanggilan langsung ke akar folder resources
        Parent root = FXMLLoader.load(getClass().getResource("/BmiCalView.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Y2K BMI Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}