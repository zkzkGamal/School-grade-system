package school1;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.stage.Stage;

public class School1 extends Application {
    static Stage primaryStage = new Stage();    
    @Override
    public void start(Stage primaryStage) {
        Login x = new Login();
        x.log();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
