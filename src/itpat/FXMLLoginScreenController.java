/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jdk.nashorn.internal.ir.Statement;

/**
 * FXML Controller class
 *
 * @author adamdanielgreen
 */
public class FXMLLoginScreenController implements Initializable {

    SQLBackend sb;

    @FXML
    private Label label;

    @FXML
    private Label invalid_label;

    @FXML
    private TextField username_box;

    @FXML
    private TextField password_box;

    @FXML
    private Button btnHelp;
    
    @FXML
    private Button btnBack;
    
    private boolean admin = true;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
                
        SQLBackend m = new SQLBackend();
        System.out.println(username_box.getText());
        m.setUsername(username_box.getText());
        System.out.println("You clicked me!");
        
       if(sb.getUsertype().equals("Student")){
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ChooseProductionScreen.fxml"));
        Parent ChooseProduction_Screen_Parent = loader.load();
        ChooseProductionScreenController screen = loader.getController();
           
        Scene Production_screen_scene = new Scene(ChooseProduction_Screen_Parent);
        Stage production_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
     
        
        if (sb.isValidCredentials(username_box.getText(), password_box.getText()) && sb.isValidUsertype(sb.getUsertype()) && sb.getUsertype().equals("Student")) {
            production_stage.hide(); //optional
            production_stage.setScene(Production_screen_scene);
            
            production_stage.show();
        } else {
            username_box.clear();
            password_box.clear();
            invalid_label.setText("Invalid Login or Usertype, please try again");
        }
        
        ChooseProductionScreenController out = new ChooseProductionScreenController();
       }
     else if(sb.getUsertype().equals("Admin")){
        
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("AdminSeatScreen.fxml"));
        Parent AdminSeatScreen_Screen_Parent = loader2.load();
        AdminSeatScreenController screen = loader2.getController();
           
        Scene Admin_screen_scene = new Scene(AdminSeatScreen_Screen_Parent);
        Stage Admin_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
     
        
        if (sb.isValidCredentials(username_box.getText(), password_box.getText()) && sb.isValidUsertype(sb.getUsertype()) && sb.getUsertype().equals("Admin")) {
            Admin_stage.hide(); //optional
            Admin_stage.setScene(Admin_screen_scene);
            
            Admin_stage.show();
        } else {
            username_box.clear();
            password_box.clear();
            invalid_label.setText("Invalid Login or Usertype, please try again");
        }
        
        AdminSeatScreenController out = new AdminSeatScreenController();
        
    }
    }

    @FXML
    void helpClicked(ActionEvent event) {
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
    void backClicked(ActionEvent event) throws IOException {
        System.out.println("btnBack clicked");
       
        Parent btnback_screen_parent = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
        Scene btnback_screen_scene = new Scene(btnback_screen_parent);
        Stage btnback_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        btnback_screen_stage.hide();
        btnback_screen_stage.setScene(btnback_screen_scene);
        btnback_screen_stage.show();
     
        
    }

 @Override
    public void initialize(URL url, ResourceBundle rb) {
        sb = new SQLBackend();
    }

}