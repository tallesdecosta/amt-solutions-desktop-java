import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;
import java.sql.Date;
import java.time.LocalDate;


public class Programa extends Application {

    public static void main(String[] args) {

        launch(args);

    }

     @Override 
    public void start(Stage stage) {

        BorderPane border = new BorderPane();

        
        HBox hbox = new HBox(10); 



        Label labelTopo = new Label("tela inicial");

        hbox.getChildren().addAll(labelTopo);

        border.setTop(hbox);

        


        HBox centerHbox = new HBox(10);
        Button btnTeste = new Button("Teste");
        Button btnNav = new Button("Criar pedido");
        btnTeste.setStyle(
            "-fx-padding: 20px;" +              
            "-fx-background-radius: 10px;" +    
            "-fx-border-radius: 10px;" +        
            "-fx-border-color: black;" +        
            "-fx-border-width: 2px;"             
        );
        
        centerHbox.getChildren().addAll(btnTeste, btnNav);
        border.setCenter(centerHbox);
        btnTeste.setOnAction(e -> {
    
            String nome = "Pedido Teste"; 

            Date dataAtual = Date.valueOf(LocalDate.now());

            Pedido novoPedido = new Pedido(nome, dataAtual);

            ArquivoPedido.adicionarPessoa(novoPedido); 

            System.out.println("Pedido criado: " + novoPedido);
            
        });

        btnNav.setOnAction(e -> {
    
            Scene novaCena = TelaCriarPedido.getScene();
            stage.setScene(novaCena);
            
        });

        


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