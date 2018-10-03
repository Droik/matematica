/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.edu.ifro.control;

import br.edu.ifro.model.Mensagens;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class RetaController implements Initializable {

   @FXML
   private TextField txtC;
   @FXML
   private TextField txtX;
   @FXML
   private TextField txtY;
   @FXML
   private TextField txtR;
   @FXML
   private TextField txtResultado;
   @FXML
   private TextField txtB;
   @FXML
   private TextField txtA;
   @FXML
   private Button btnVoltar;
   @FXML
   private Button btnCalcular;
   
   public double m, m1 , m2, m3 , m4, m5, m6;
 
   @Override
   public void initialize(URL url, ResourceBundle rb) {
       
   }    
 
    @FXML
   private void btnCalcular (ActionEvent event){
       double A = Double.parseDouble(txtA.getText());
       double B = Double.parseDouble(txtB.getText());
       double C = Double.parseDouble(txtC.getText());
       double X = Double.parseDouble(txtX.getText());
       double Y = Double.parseDouble(txtY.getText());
       double R = Double.parseDouble(txtR.getText());
       
        Mensagens msg = new Mensagens( "Matemática");
       double result;
       m1 = A;
       m2 = B;
       m3 = Math.pow(m1 , 2);
       m4 = Math.pow(m2 , 2);
       
       m6 = R;
       
       
       result =  A*X*C+B*Y*R/Math.sqrt(m2 + m4);
       String resultado = Double.toString(result);
       txtResultado.setText(resultado);
       
       if (m5 < result){
           msg.informacao("Reta Secante");
       } else {
        
           msg.informacao("Reta Externa");
       }
       if (m5 == result){
           msg.informacao("Reta Tangente");
       }
       
       
   }

    private void resultado(ActionEvent event) {
        
    }

    @FXML
    private void Menu(ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MenuPrincipal.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.setTitle("Menu Principal");
       stage.setScene(scene);
       stage.show();  
    }


}
