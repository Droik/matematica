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
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class InternasController implements Initializable {
    @FXML
    private Button btnVoltar;
    @FXML
    private TextField txtRaio1;
    @FXML
    private TextField txtRaio2;
    @FXML
    private TextField txtDistancia;
    @FXML
    private Button btnCalcular;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    @FXML
    private void voltar(ActionEvent event) throws IOException {
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

    @FXML
    private void calcular(ActionEvent event) {
        double x1 = Double.parseDouble(txtRaio1.getText());
        double x2 = Double.parseDouble(txtRaio2.getText());
        double Result;
        Result = x1-x2;
        
        String resultado = Double.toString(Result);
        txtDistancia.setText(resultado);       
    }
}
