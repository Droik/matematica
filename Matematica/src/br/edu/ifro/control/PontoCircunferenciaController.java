/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import static java.awt.PageAttributes.MediaType.A1;
import br.edu.ifro.model.PosicaoCircunferencia;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author 04225321266
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

    public TextField getTxtX() {
        return txtX;
    }

    public void setTxtX(TextField txtX) {
        this.txtX = txtX;
    }

    public TextField getTxtY() {
        return txtY;
    }

    public void setTxtY(TextField txtY) {
        this.txtY = txtY;
    }

    public Button getBtnExecutar() {
        return btnExecutar;
    }

    public void setBtnExecutar(Button btnExecutar) {
        this.btnExecutar = btnExecutar;
    }

    public TextField getTxtResultado() {
        return txtResultado;
    }

    public void setTxtResultado(TextField txtResultado) {
        this.txtResultado = txtResultado;
    }

    public TextField getTxtA() {
        return txtA;
    }

    public void setTxtA(TextField txtA) {
        this.txtA = txtA;
    }

    public TextField getTxtB() {
        return txtB;
    }

    public void setTxtB(TextField txtB) {
        this.txtB = txtB;
    }

    public TextField getTxtRaio() {
        return txtRaio;
    }

    public void setTxtRaio(TextField txtRaio) {
        this.txtRaio = txtRaio;
    }
public double m1,m2,m3,m4,m5,m6;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void executar(ActionEvent event)throws IOException {
        Double A1 = Double.parseDouble(txtX.getText());
        Double A2 = Double.parseDouble(txtY.getText());
        Double A3 = Double.parseDouble(txtA.getText());
        Double A4 = Double.parseDouble(txtB.getText());
        Double A5 = Double.parseDouble(txtRaio.getText());
        
        Double result;
        
        double m1 = Math.pow(A1 , 2);
        double m2 = Math.pow(A2 , 2);
        double m3 = m1 - m2;
        double m4 = Math.pow(A3 , 2);
        double m5 = Math.pow(A4 , 2);
        double m6 = m4 - m5;
        
        result = m3 + m6;
        String resultado = Double.toString(result);
        txtResultado.setText(resultado);
        
     
   
                
    }

    
    }
  


