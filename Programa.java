import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;


public class Programa extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override 
    public void start(Stage stage) {

        BorderPane border = new BorderPane();

        
        HBox hbox = new HBox(10); 



        Label labelTopo = new Label("Menu:");
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");

        hbox.getChildren().addAll(labelTopo, btn1, btn2);

        border.setTop(hbox);

        


        HBox centerHbox = new HBox(10);
        Button btnEstoque = new Button("Estoque");
        btnEstoque.setStyle(
            "-fx-padding: 20px;" +              
            "-fx-background-radius: 10px;" +    
            "-fx-border-radius: 10px;" +        
            "-fx-border-color: black;" +        
            "-fx-border-width: 2px;"             
        );
        centerHbox.getChildren().addAll(btnEstoque);
        border.setCenter(centerHbox);


        Scene scene = new Scene(border);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

        stage.setX(screenBounds.getMinX());
        stage.setY(screenBounds.getMinY());
        stage.setWidth(screenBounds.getWidth());
        stage.setHeight(screenBounds.getHeight());
        stage.setScene(scene);
        stage.setTitle("Teste");
        stage.show();

    }

}