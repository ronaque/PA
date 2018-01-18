import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class PAInterface extends Application{
	public static void main(String[] args){
		launch(args);
	}
        
        static TextField termo1;
        static TextField termo2;
        static TextField termo3;
        
        static TextField fieldSoma;
        static TextField fieldTermo;
        static TextField fieldTermoCentral;
        
        double result;
        
	@Override
	public void start(Stage primaryScene) throws Exception{
		Stage window = primaryScene;
              
		
		GridPane grid = new GridPane();
 
                grid.setHgap(10);
                grid.setVgap(10);
                grid.setPadding(new Insets(40, 20, 20, 20));
                
                //Label greetings = new Label("Calculadora de  P.A.");
		//calculo da PA
                Label labelPA = new Label("Digite 3 números e veja se eles são uma PA");
                Button calcPA = new Button ("calcular");
		termo1 = new TextField("Digite o 1º termo");
		termo2  = new TextField("Digite o 2º termo");
		termo3 = new TextField("Digite o 3º termo");
		
                calcPA.setOnAction(e -> {
                    result = PA.isPA(termo1.getText(), termo2.getText(), termo3.getText());
                    
                    if(result == 1){
                        ResultBox.display("Resultado", "É uma PA, e a sua razão é: " +  String.valueOf(PA.razao));
                    }else if(result == 0) {
                        ResultBox.display("Resultado", "Não é PA");
                    }
                });

                //Calcular soma dos termos
                Label labelSoma = new Label("Calcular soma dos termos");
		fieldSoma = new TextField("Digite a posição do termo em que a soma vai acabar");
		Button buttonSoma = new Button("somar");
                
                buttonSoma.setOnAction(e -> {
                    if(result == 1){
                        if(PA.getSoma(fieldSoma.getText()) != -1){

                            ResultBox.display("Resultado", "A  soma é: " +  String.valueOf(PA.getSoma(fieldSoma.getText())));
                        }
                    }else{
                        ResultBox.display("Erro", "Os números não são uma PA, insira uma PA");
                    }
  
                });
                
		//Calculo dos termos
                Label labelTermo = new Label("Calcular termos");
		fieldTermo = new TextField("Digite a posição do termo");
                Button buttonTermo = new Button("encontrar");
                
                buttonTermo.setOnAction(e -> {
                    if(result == 1){
                        if(PA.getTermo(fieldTermo.getText()) != -1){

                            ResultBox.display("Resultado", "O termo é: " +  String.valueOf(PA.getTermo(fieldTermo.getText())));
                        }
                    }else{
                        ResultBox.display("Erro", "Os números não são uma PA, insira uma PA");
                    }
                });
                
                //termo central   
                Label labelTermoCentral = new Label("Calcular Termo Central");
                fieldTermoCentral = new TextField("Digite o tamanho da PA");
                Button buttonTermoCentral = new Button("Calcular");
                
                buttonTermoCentral.setOnAction(e -> {
                    if(result == 1){
                        if(PA.getTermoCentral(fieldTermoCentral.getText()) != -1){
                      
                            ResultBox.display("Resultado", "O termo central é: " +  String.valueOf(PA.getTermoCentral(fieldTermoCentral.getText())));
                        }
                    }
                    else{
                        ResultBox.display("Erro", "Os números não são uma PA, insira uma PA");
                    }
  
                });
                
                
                //grid.add(greetings, 4, 0);
                
                grid.add(labelPA, 4, 2);
                grid.add(termo1, 3, 3);
                grid.add(termo2, 4, 3);
                grid.add(termo3, 5, 3);
                grid.add(calcPA, 6, 3);
                
                grid.add(labelTermo, 1, 6);
                grid.add(fieldTermo, 1, 7);
                grid.add(buttonTermo, 2, 7);
                
                grid.add(labelSoma, 4, 6);
                grid.add(fieldSoma, 4, 7);
                grid.add(buttonSoma, 5, 7);
                
                grid.add(labelTermoCentral, 6, 6);
                grid.add(fieldTermoCentral, 6, 7);
                grid.add(buttonTermoCentral, 7, 7);
                
                Scene scene = new Scene(grid);
                window.setTitle("Calculadora de PA");
                window.getIcons().add(new Image("PA.png"));
                window.setScene(scene);
                window.show();
  
    }   
}
