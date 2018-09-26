/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.edu.ifro.control;

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
   
   public double m, m1 , m2, m3 , m4, m5;
 
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
       double Resultado = Double.parseDouble(txtResultado.getText());
       
       
       m1 = A;
       m2 = B;
       m3 = Math.pow(m1 , 2);
       m4 = Math.pow(m2 , 2);
       m5 = Resultado;
       
       m5 = A*X*C+B*Y*R/Math.sqrt(m2 + m4);
       
       if (m5 < 0){
           m5 = m5* (-1);
       } else {
           m5 = m5;
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
