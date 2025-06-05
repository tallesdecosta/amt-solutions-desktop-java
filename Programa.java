import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Programa extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override 
    public void start(Stage stage) {

        Label label = new Label("Isso é um teste.");
        Scene scene = new Scene(label, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Teste");
        stage.show();

    }

}