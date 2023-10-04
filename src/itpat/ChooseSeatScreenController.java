/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ChooseSeatScreenController implements Initializable {

    SQLBackend sb;
    int count = 0;

    @FXML
    private Button btnNext;

    @FXML
    private Button btnHelp;

    @FXML
    private CheckBox QuantityCheckbox;

    @FXML
    private Button btnB1;

    @FXML
    private Button btnA1;

    @FXML
    private Button btnD1;

    @FXML
    private Button btnC1;

    @FXML
    private Button btnD5;

    @FXML
    private Button btnC5;

    @FXML
    private Button btnB5;

    @FXML
    private Button btnA5;

    @FXML
    private Button btnA4;

    @FXML
    private Button btnD3;

    @FXML
    private Button btnC3;

    @FXML
    private Button btnA3;

    @FXML
    private Button btnD2;

    @FXML
    private Button btnB2;

    @FXML
    private Button btnA2;

    @FXML
    private Button btnC2;

    @FXML
    private Button btnB3;

    @FXML
    private Button btnD4;

    @FXML
    private Button btnC4;

    @FXML
    private Button btnB4;
    @FXML
    private Button btnFinish;
    

    @FXML
    void btnA1Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnA1.getStyle()) == true) {
            btnA1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(1);
            sb.updateSeating();
           // sb.IsSeatAvailable("A1");
        }
      //}
    }

    @FXML
    void btnA2Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnA2.getStyle()) == true) {
            btnA2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(2);
            sb.updateSeating();
           // sb.IsSeatAvailable("A2");
        }
       //}

    }

    @FXML
    void btnA3Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnA3.getStyle()) == true) {
            btnA3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(3);
            sb.updateSeating();
         //   sb.IsSeatAvailable("A3");
        }
       //}
    }

    @FXML
    void btnA4Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnA4.getStyle()) == true) {
            btnA4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(4);
            sb.updateSeating();
          //  sb.IsSeatAvailable("A4");
        }
       //}
    }

    @FXML
    void btnA5Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnA5.getStyle()) == true) {
            btnA5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(5);
            sb.updateSeating();
           // sb.IsSeatAvailable("A5");
        }
    //}
    }

    @FXML
    void btnB1Clicked(ActionEvent event) {
//while(count<8){
        if (sb.isAvailable(btnB1.getStyle()) == true) {
            btnB1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(1);
            sb.updateSeating();
       // sb.IsSeatAvailable("B1");
        }
    //}
    }

    @FXML
    void btnB2Clicked(ActionEvent event) {
       //while(count<8){
        if (sb.isAvailable(btnB2.getStyle()) == true) {
            btnB2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(2);
            sb.updateSeating();
       //     sb.IsSeatAvailable("B2");
        }
       //}
    }

    @FXML
    void btnB3Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnB3.getStyle()) == true) {
            btnB3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(3);
            sb.updateSeating();
        //   sb.IsSeatAvailable("B3");
        }
        //}
    }

    @FXML
    void btnB4Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnB4.getStyle()) == true) {
            btnB4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(4);
         //   sb.updateSeating();
        }
    //}
    }

    @FXML
    void btnB5Clicked(ActionEvent event) {
       //while(count<8){
        if (sb.isAvailable(btnB5.getStyle()) == true) {
            btnB5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("B5");
        }
        //}
    }

    @FXML
    void btnC1Clicked(ActionEvent event) throws SQLException {
        //while(count<8){
        if (sb.isAvailable(btnC1.getStyle()) == true) {
            btnC1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(1);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C1");
        }
        // if(sb.IsSeatAvailable() == false){
        //btnC1.setStyle("fx-background-color: #434b4d");
        //}
    //}
    }

    @FXML
    void btnC2Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnC2.getStyle()) == true) {
            btnC2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(2);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C2");
        }
    //}
    }

    @FXML
    void btnC3Clicked(ActionEvent event) {
       //while(count<8){
        if (sb.isAvailable(btnC3.getStyle()) == true) {
            btnC3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(3);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C3");
        }
    //}
    }

    @FXML
    void btnC4Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnC4.getStyle()) == true) {
            btnC4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(4);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C4");
        }
    //}
    }

    @FXML
    void btnC5Clicked(ActionEvent event) {
       //while(count<8){
        if (sb.isAvailable(btnC5.getStyle()) == true) {
            btnC5.setStyle("-fx-background-color: #434b4d");
            sb.setSeatLetter("C");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C5");
        }
    //}
    }

    @FXML
    void btnD1Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnD1.getStyle()) == true) {
            btnD1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(1);
            sb.updateSeating();
           // sb.IsSeatAvailable("D1");
        }
    //}
    }

    @FXML
    void btnD2Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnD2.getStyle()) == true) {
            btnD2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(2);
            sb.updateSeating();
           // sb.IsSeatAvailable("D2");
        }
        //}
    }

    @FXML
    void btnD3Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnD3.getStyle()) == true) {
            btnD3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(3);
            sb.updateSeating();
           // sb.IsSeatAvailable("D3");
        }
        //}
    }

    @FXML
    void btnD4Clicked(ActionEvent event) {
        //while(count<8){
        if (sb.isAvailable(btnD4.getStyle()) == true) {
            btnD4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(4);
            sb.updateSeating();
           // sb.IsSeatAvailable("D4");
        }
    //}
    }

    @FXML
    void btnD5Clicked(ActionEvent event) {
       //while(count<8){
        if (sb.isAvailable(btnA3.getStyle()) == true) {
            btnD5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("D5");
        }
    //}
    }

    @FXML
    void helpClicked(ActionEvent event) {
        System.out.println("Help Clicked");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HelpScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setTitle("Help S");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
    }

    @FXML
    void nextClicked(ActionEvent event) throws IOException {
        System.out.println("Next Clicked");
        Parent print_screen_parent = FXMLLoader.load(getClass().getResource("PrintTicketScreen.fxml"));
        Scene print_screen_scene = new Scene(print_screen_parent);
        Stage print_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        print_screen_stage.hide();
        print_screen_stage.setScene(print_screen_scene);
        print_screen_stage.show();
    }

    @FXML
    void btnQuantityCheckboxClicked(ActionEvent event) {
        QuantityCheckbox.setText(String.valueOf(count));
        sb = new SQLBackend();
        sb.setCount(count);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sb = new SQLBackend();
//Checks availability and changes colour from A1-A5
       if (sb.IsSeatAvailable("A1") == false) {                    //supposed to make buttons change colour to unavailable and not be allowed to be clicked
            btnA1.setStyle("-fx-background-color: #434b4d ");           //problem is buttons must be clicked
        }
        if (sb.IsSeatAvailable("A2") == false) {
            btnA2.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("A3") == false) {
            btnA3.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("A4") == false) {
            btnA4.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("A5") == false) {
            btnA5.setStyle("-fx-background-color: #434b4d ");
        }
       //Checks availability and changes colour from b1-b5
        if (sb.IsSeatAvailable("B1") == false) {
            btnB1.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("B2") == false) {
            btnB2.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("B3") == false) {
            btnB3.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("B4") == false) {
            btnB4.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("B5") == false) {
            btnB5.setStyle("-fx-background-color: #434b4d ");
        }
       
//Checks availability and changes colour from c1-c5
        if (sb.IsSeatAvailable("C1") == false) {
            btnC1.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("C2") == false) {
            btnC2.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("C3") == false) {
            btnC3.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("C4") == false) {
            btnC4.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("C5") == false) {
            btnC5.setStyle("-fx-background-color: #434b4d ");
        }
        //Checks availability and changes colour from d1-d5
        if (sb.IsSeatAvailable("D1") == false) {
            btnD1.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("D2") == false) {
            btnD2.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("D3") == false) {
            btnD3.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("D4") == false) {
            btnD4.setStyle("-fx-background-color: #434b4d ");
        }
        if (sb.IsSeatAvailable("D5") == false) {
            btnD5.setStyle("-fx-background-color: #434b4d ");
        }
    } 
}
