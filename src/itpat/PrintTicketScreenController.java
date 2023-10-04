/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author adamdanielgreen
 */
public class PrintTicketScreenController implements Initializable {

    SQLBackend sb;
    
    @FXML
    private Label StudentName;

    @FXML
    private Button btnHelp;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnPrint;
    @FXML
    private Button btnViewPDF;

    @FXML
    private Button btnFinnish;

    @FXML
    private Label quanityLabel;
    
    @FXML
    private Label priceLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      sb = new SQLBackend();
      
      String result = sb.getUsername();
        System.out.println("Returned msg: " + result);
        
        
        StudentName.setText("Thank you for purchasing " + result);
        
        int countResult = sb.getCount();
        System.out.println("Returned msg: " + countResult);
        String str = countResult + "";
        quanityLabel.setText(str);
   
    
    String name = sb.getProductionName();
        System.out.println("Returned msg: " +name);
        
        
        priceLabel.setText("R" + Integer.parseInt(sb.ticketPriceCheck(name))*countResult);
    
    
    }    
    

    @FXML
    private void helpClicked(ActionEvent event) {
    try {
            System.out.println("Help Clicked");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HelpScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't open window");
        }
    }

    @FXML
    private void btnBackClicked(ActionEvent event) throws IOException {
        System.out.println("btnBack clicked");
       
        Parent btnback_screen_parent = FXMLLoader.load(getClass().getResource("ChooseSeatScreen.fxml"));
        Scene btnback_screen_scene = new Scene(btnback_screen_parent);
        Stage btnback_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        btnback_screen_stage.hide();
        btnback_screen_stage.setScene(btnback_screen_scene);
        btnback_screen_stage.show();
     
        
    }

    @FXML
    private void btnPrintClicked(ActionEvent event) {
    }

    @FXML
    private void btnViewPDFClicked(ActionEvent event) {
    }
    
     @FXML
    void btnFinnishClicked(ActionEvent event) {

    final Node source = (Node) event.getSource();
    final Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }


    
   
}
