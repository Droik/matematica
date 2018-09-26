/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;
import br.edu.ifro.model.PosicaoCircunferencia;
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
public class PosicaoCircunferencialController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnSair;
    @FXML
    private TextField txtXC1;
    @FXML
    private TextField txtYC1;
    @FXML
    private TextField txtTC1;
    @FXML
    private TextField txtTC2;
    @FXML
    private TextField txtYC2;
    @FXML
    private TextField txtXC2;
  
    public double a1,b1,c1,r1;
    public double a2,b2,c2,r2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcular(ActionEvent event) {
    double xc1 = Double.parseDouble(txtXC1.getText());
    double yc1 = Double.parseDouble(txtYC1.getText());
    double tc1 = Double.parseDouble(txtTC1.getText());
    double tc2 = Double.parseDouble(txtTC2.getText());
    double xc2 = Double.parseDouble(txtXC2.getText());
    double yc2 = Double.parseDouble(txtYC2.getText());
    
    a1 = xc1/-2;
    b1 = yc1/-2;
    c1 = tc1;
    a1 = a1*2;
    b1 = b1*2;
    r1 = a1 + b1;
    r1 = (c1)-r1;
    r1 = (float)Math.pow(r1);
    
    a2 = xc2/-2;
    b2 = yc2/-2;
    c2 = tc2;
    a2 = a2*2;
    b2 = b2*2;
    r2 = a2 + b2;
    r2 = (c2)-r2;
    r2 = (float)Math.pow(r2);
       }

    @FXML
    private void sair(ActionEvent event) {
    }
    
}
