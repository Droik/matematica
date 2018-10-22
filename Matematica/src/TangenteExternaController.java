/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * @author kg598
 */
public class TangenteExternaController implements Initializable {

    @FXML
    private TextField txtRaio2;
    @FXML
    private TextField txtRaio1;
    @FXML
    private TextField txtDistancia;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnCalcular;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void voltar(ActionEvent event) {
    }

    @FXML
    private void calcular(ActionEvent event) {
        double R1 = Double.parseDouble(txtRaio1.getText());
        double R2 = Double.parseDouble(txtRaio2.getText());
        
        double result;
        
        result = R1 + R2;
        
        String resultado = Double.toString(result);
        txtDistancia.setText(resultado);
    }
    
}
