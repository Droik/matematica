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
    private Button btnSair;
    @FXML
    private TextField txtXC1;
    @FXML
    private TextField txxtYC1;
    @FXML
    private TextField txtTC1;
    @FXML
    private TextField txtTC2;
    @FXML
    private TextField txxtYC2;
    @FXML
    private TextField txtXC2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void calcularPC(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/PosicaoCircunferencia.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Posição Circunferência");
        stage.setScene(scene);
        stage.show();  
    }

    public void calcularCR(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Reta.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Reta");
        stage.setScene(scene);
        stage.show();  
    }

    public void calcular(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/PontoCircunferencia.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Ponto e Circunferência");
        stage.setScene(scene);
        stage.show();  
    }

    

    

    
}
