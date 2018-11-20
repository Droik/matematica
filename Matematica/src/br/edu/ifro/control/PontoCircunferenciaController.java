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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kg598
 */
public class PontoCircunferenciaController implements Initializable {

    @FXML
    private TextField txtX;
    @FXML
    private TextField txtY;
    @FXML
    private Button btnExecutar;
    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txtA;
    @FXML
    private TextField txtB;
    @FXML
    private TextField txtRaio;
    @FXML
    private Button btnMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void executar(ActionEvent event) {
         double x = Double.parseDouble(txtX.getText());
         double y = Double.parseDouble(txtY.getText());
         double A = Double.parseDouble(txtA.getText());
         double B = Double.parseDouble(txtB.getText());
         double raio = Double.parseDouble(txtRaio.getText());
         double result;
         
         result = ((x-A)*(x-A)+(y-B)*(y-B));
         String resultado = Double.toString(result);
         txtResultado.setText(resultado);
         
         if(result== raio){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Ponto está dentro da circunferência!");
            alert.setTitle("Ponto");
            alert.show();
         
         }else{
             if(result > raio){
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText("Ponto está fora da Circunferência!");
                 alert.setTitle("Ponto");
                 alert.show();
             }
         else{
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Ponto está dentro da circuferência!");
                alert.setTitle("Ponto");
                alert.show();
                 }
         
                
         
         
    }
    }

    @FXML
    private void menu(ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MenuPrincipal.fxml"));
       Scene scene = new Scene(fxmlLoader.load());
       Stage stage = new Stage();
       stage.getIcons().add(new Image("img/lousa-matematica.jpg"));
       stage.setTitle("Menu Principal");
       stage.setScene(scene);
       stage.show();  
       Stage stage1 = (Stage) btnExecutar.getScene().getWindow();
       stage1.close();
    }
    
}
