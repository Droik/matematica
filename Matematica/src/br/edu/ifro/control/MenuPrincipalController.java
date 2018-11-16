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

/**
 * FXML Controller class
 *
 * @author Evaristo
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnCCPC;
    @FXML
    private Button btnCR;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    public void calcularCR(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Reta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Reta");
        stage.setScene(scene);
        stage.show(); 
       Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
       stage1.close();
    }

    @FXML
    public void calcular(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/PontoCircunferencia.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Ponto e Circunferência");
        stage.setScene(scene);
        stage.show();
        Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
        stage1.close();
    }

    @FXML
    private void CalPC(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/PosicaoCircunferencial.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Posição Circunferência");
        stage.setScene(scene);
        stage.show();  
        Stage stage1 = (Stage) btnCalcular.getScene().getWindow();
        stage1.close();
    }

    

    

    
}
