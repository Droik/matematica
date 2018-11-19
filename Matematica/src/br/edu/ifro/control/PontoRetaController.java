package br.edu.ifro.control;


import br.edu.ifro.model.Mensagens;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class PontoRetaController implements Initializable {

    @FXML
    private TextField txtX;
    @FXML
    private TextField txtY;
    @FXML
    private TextField txtC;
    @FXML
    private TextField txtA;
    @FXML
    private TextField txtB;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnCancelar;
    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txtR;
    
    public double m, m1 , m2, m3 , m4, m5, m6;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void calcular(ActionEvent event) {
       double A = Double.parseDouble(txtA.getText());
       double B = Double.parseDouble(txtB.getText());
       double C = Double.parseDouble(txtC.getText());
       double X = Double.parseDouble(txtX.getText());
       double Y = Double.parseDouble(txtY.getText());
       double R = Double.parseDouble(txtR.getText());
       double Resultado = Double.parseDouble(txtResultado.getText());
        Mensagens msg = new Mensagens( "Matemática");
       
       m1 = A;
       m2 = B;
       m3 = Math.pow(m1 , 2);
       m4 = Math.pow(m2 , 2);
       m5 = Resultado;
       m6 = R;
       m5 = A*X*C+B*Y*R/Math.sqrt(m2 + m4);
       
       if (m5 < m6){
           msg.informacao("Reta Secante");
       } else {
        
           msg.informacao("Reta Externa");
       }
       if (m5 == m6){
           msg.informacao("Reta Tangente");
       }
    }

    @FXML
    private void cancelar(ActionEvent event) {
        System.exit(0);
    }
    
}
