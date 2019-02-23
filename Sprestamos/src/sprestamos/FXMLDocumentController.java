/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprestamos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author kenyi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
       @FXML
    private AnchorPane anchopane;

    @FXML
    private TabPane tabpane;
    
    @FXML
    private VBox Hbotones;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Iniciar();
        // TODO
    }    
    public void Iniciar(){
        AnchorPane.setBottomAnchor(tabpane, 0.0);
        AnchorPane.setRightAnchor(tabpane, 0.0);
        AnchorPane.setTopAnchor(tabpane, 0.0);
        AnchorPane.setLeftAnchor(tabpane, 0.0);
        
        AnchorPane.setBottomAnchor(Hbotones, 0.0);
        AnchorPane.setTopAnchor(Hbotones, 0.0);
        AnchorPane.setLeftAnchor(Hbotones, 0.0);
    
    }
}
