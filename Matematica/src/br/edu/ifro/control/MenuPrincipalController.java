/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    @FXML
    private void calcular(ActionEvent event) {
    }

    @FXML
    private void sair(ActionEvent event) {
    }
    
}
