/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.edu.ifro.control;
import br.edu.ifro.model.Mensagens;
import br.edu.ifro.model.PosicaoCircunferencia;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
* FXML Controller class
*
* @author Evaristo
*/
public class PosicaoCircunferencialController implements Initializable {

   @FXML
   private Button btnCalcular;
   @FXML
   private Button btnSair;
   @FXML
   private TextField txtXC1;
   private TextField txtYC1;
   @FXML
   private TextField txtTC1;
   @FXML
   private TextField txtTC2;
   private TextField txtYC2;
   @FXML
   private TextField txtXC2;
 
   public double a1,b1,c1,r1;
   public double a2,b2,c2,r2;
   public double dc1c2,x,y;
   public double rp,rn;
    @FXML
    private TextField txxtYC1;
    @FXML
    private TextField txxtYC2;
   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb) {
       // TODO
   }    

  

    @FXML
    private void cal(ActionEvent event) throws IOException {
        double xc1 = Double.parseDouble(txtXC1.getText());
        double yc1 = Double.parseDouble(txxtYC1.getText());
        double tc1 = Double.parseDouble(txtTC1.getText());
        double tc2 = Double.parseDouble(txtTC2.getText());
        double xc2 = Double.parseDouble(txtXC2.getText());
        double yc2 = Double.parseDouble(txxtYC2.getText());
        Mensagens msg = new Mensagens("Matemática");
   a1 = xc1/-2;
   b1 = yc1/-2;
   c1 = tc1;
   a1 = a1*a1;
   b1 = b1*b1;
   r1 = a1 + b1;
   r1 = (c1)-r1;
   r1 = (double)Math.pow(r1,2);
   
   a2 = xc2/-2;
   b2 = yc2/-2;
   c2 = tc2;
   a2 = a2*2;
   b2 = b2*2;
   r2 = a2 + b2;
   r2 = (c2)-r2;
   r2 = (double)Math.pow(r2,2);
   
   x = (a1)-(a2);
   x = (x)*(x);
   y = (b1)-(b2);
   y = (y)*(y);
   
   dc1c2 = x+y;
   dc1c2 = (double)Math.pow(dc1c2,2);
   
   r1 = r1*-1;
   r2 = r2*-1;
   rn = r1 - r2;
   rp = r1+r2;
    if((rn) < (dc1c2) && (dc1c2)< (rp)){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Secantes.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.setTitle("Secante");
       stage.setScene(scene);
       stage.show();
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Secantes");
       alert.setTitle("Secantes");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
        
    }else{
    if(dc1c2 == 0){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CircunferenciaConcentrica.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Circunferencia Concentrica");
       stage.setScene(scene);
       stage.show();
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Circunferencia Concentrica");
       alert.setTitle("Circuferencia");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
       
    }else{
    if((dc1c2) == (rn)){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/TangenteInterna.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Tangete Interna");
       stage.setScene(scene);
       stage.show();
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Tangente Interna");
       alert.setTitle("Tangente");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
       
    }else{
    if((dc1c2) == (rp)){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/TangenteExterna.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Tangete Externa");
       stage.setScene(scene);
       stage.show();   
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Tangente Externa!");
       alert.setTitle("Tangente");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
       
    }else{
    if((dc1c2) > (rp)){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Externa.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Externa");
       stage.setScene(scene);
       stage.show();
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Externa!");
       alert.setTitle("Externa");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
       
    }else{
    if((dc1c2) < (rp)){
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Internas.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Interna");
       stage.setScene(scene);
       stage.show(); 
       Alert alert = new Alert(Alert.AlertType.ERROR);
       alert.setHeaderText("Interna!");
       alert.setTitle("Interna");
       alert.show();
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
       
       
      }
            
}
               
    }
    }
    }
    }
    }

    @FXML
    private void sair(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
        stage.setTitle("Menu Principal");
        stage.setScene(scene);
        stage.show();
        Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
        stage1.close();
    }
}

    
    
    
    
   

    