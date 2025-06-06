import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;
import java.sql.Date;
import java.time.LocalDate;

public class TelaCriarPedido {

    public static Scene getScene() {

        BorderPane border = new BorderPane();

        
        HBox hbox = new HBox(10); 



        Label labelTopo = new Label("Criação de pedidos");

        hbox.getChildren().addAll(labelTopo);

        border.setTop(hbox);


        return new Scene(border, 400, 300);

    }

}
