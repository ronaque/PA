
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ResultBox{
    public static void display(String title, String message){
        Stage window = new Stage();
        VBox layout = new VBox(20);
        window.initModality(Modality.APPLICATION_MODAL);

        
        Label result = new Label(message);
        Button out = new Button("Sair");
        out.setOnAction(e -> window.close());
        
        
        layout.getChildren().addAll(result, out);
        
        Scene scene = new Scene(layout);

        window.setTitle("Calculadora de PA");
        window.getIcons().add(new Image("PA.png"));
        
        window.setScene(scene);
        window.showAndWait();
       
    }
}