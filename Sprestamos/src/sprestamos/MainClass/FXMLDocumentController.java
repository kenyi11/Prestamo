/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprestamos.MainClass;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

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
    private Button btnTrapaso;
     
      @FXML
    private Button btnNomina;
      
      @FXML
    private Button btnClientes;

    @FXML
    private Button btnClculadora;
    
    @FXML
    private StackPane rootConteiner;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Iniciar();
        btnNomina.setOnAction(e -> nomina());
        btnClientes.setOnAction(e -> clientes());
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

    private void nomina() {
        try {
            System.out.println("nomina");
            AnchorPane ac =  (AnchorPane) rootConteiner.getChildren().get(0);
            Parent root = FXMLLoader.load(getClass().getResource("/sprestamos/nomina/nominaFXML.fxml"));
            root.translateXProperty().set(-10-rootConteiner.getWidth());
            rootConteiner.getChildren().add(root);
            Timeline timeline = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(),0,Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
            timeline.getKeyFrames().add(kf);
            timeline.play();
            rootConteiner.getChildren().remove(ac);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clientes() {
       try {
            System.out.println("nomina");
            AnchorPane ac =  (AnchorPane) rootConteiner.getChildren().get(0);
            Parent root = FXMLLoader.load(getClass().getResource("/registroDeClientes/registroDeClientes.fxml"));
            root.translateXProperty().set(-10-rootConteiner.getWidth());
            rootConteiner.getChildren().add(root);
            Timeline timeline = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(),0,Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
            timeline.getKeyFrames().add(kf);
            timeline.play();
            rootConteiner.getChildren().remove(ac);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
