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

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    private void voltar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu Principal");
        stage.setScene(scene);
        stage.show();  
}
    private void calcular(ActionEvent event) throws IOException{
        double xc1 = Double.parseDouble(txtA.getText());
        double yc1 = Double.parseDouble(txtB.getText());
        double tc1 = Double.parseDouble(txtC.getText());
        double tc2 = Double.parseDouble(txtX.getText());
        double xc2 = Double.parseDouble(txtY.getText());
        double yc2 = Double.parseDouble(txtR.getText());
    
        
    
        
       
        
    }

}
