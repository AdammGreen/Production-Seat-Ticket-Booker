/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author adamdanielgreen
 */
public class AdminSeatScreenController implements Initializable {

   SQLBackend sb;
     int count = 0;
     
    @FXML
    private Button btnFinish;
    @FXML
    private Button btnHelp;
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
    private TextField MakeAvailable;
    @FXML
    private TextField MakeUnavailable;
    @FXML
    private TextField refundAmount;
    @FXML
    private TextField bookersName;
    @FXML
    private ChoiceBox<String> production;

   
      

    @FXML
    private void btnFinishClicked(ActionEvent event) {
     final Node source = (Node) event.getSource();
    final Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }

    @FXML
    private void btnHelpClicked(ActionEvent event) {
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
    void btnA1Clicked(ActionEvent event) {

        if (sb.isAvailable(btnA1.getStyle()) == true) {
            btnA1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(1);
            sb.updateSeating();
            //sb.IsSeatAvailable("A1");
        }
    }

    @FXML
    void btnA2Clicked(ActionEvent event) {

        if (sb.isAvailable(btnA2.getStyle()) == true) {
            btnA2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(2);
            sb.updateSeating();
           // sb.IsSeatAvailable("A2");
        }

    }

    @FXML
    void btnA3Clicked(ActionEvent event) {

        if (sb.isAvailable(btnA3.getStyle()) == true) {
            btnA3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(3);
            sb.updateSeating();
         //   sb.IsSeatAvailable("A3");
        }

    }

    @FXML
    void btnA4Clicked(ActionEvent event) {

        if (sb.isAvailable(btnA4.getStyle()) == true) {
            btnA4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(4);
            sb.updateSeating();
          //  sb.IsSeatAvailable("A4");
        }

    }

    @FXML
    void btnA5Clicked(ActionEvent event) {

        if (sb.isAvailable(btnA5.getStyle()) == true) {
            btnA5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("A");
            sb.setSeatNumber(5);
            sb.updateSeating();
           // sb.IsSeatAvailable("A5");
        }
    }

    @FXML
    void btnB1Clicked(ActionEvent event) {

        if (sb.isAvailable(btnB1.getStyle()) == true) {
            btnB1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(1);
            sb.updateSeating();
       // sb.IsSeatAvailable("B1");
        }
    }

    @FXML
    void btnB2Clicked(ActionEvent event) {
        if (sb.isAvailable(btnB2.getStyle()) == true) {
            btnB2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(2);
            sb.updateSeating();
       //     sb.IsSeatAvailable("B2");
        }
    }

    @FXML
    void btnB3Clicked(ActionEvent event) {
        if (sb.isAvailable(btnB3.getStyle()) == true) {
            btnB3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(3);
            sb.updateSeating();
        //   sb.IsSeatAvailable("B3");
        }
    }

    @FXML
    void btnB4Clicked(ActionEvent event) {
        if (sb.isAvailable(btnB4.getStyle()) == true) {
            btnB4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(4);
         //   sb.updateSeating();
        }
    }

    @FXML
    void btnB5Clicked(ActionEvent event) {
        if (sb.isAvailable(btnB5.getStyle()) == true) {
            btnB5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("B");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("B5");
        }
    }

    @FXML
    void btnC1Clicked(ActionEvent event) throws SQLException {
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
    }

    @FXML
    void btnC2Clicked(ActionEvent event) {
        if (sb.isAvailable(btnC2.getStyle()) == true) {
            btnC2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(2);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C2");
        }
    }

    @FXML
    void btnC3Clicked(ActionEvent event) {
        if (sb.isAvailable(btnC3.getStyle()) == true) {
            btnC3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(3);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C3");
        }
    }

    @FXML
    void btnC4Clicked(ActionEvent event) {
        if (sb.isAvailable(btnC4.getStyle()) == true) {
            btnC4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("C");
            sb.setSeatNumber(4);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C4");
        }
    }

    @FXML
    void btnC5Clicked(ActionEvent event) {
        if (sb.isAvailable(btnC5.getStyle()) == true) {
            btnC5.setStyle("-fx-background-color: #434b4d");
            sb.setSeatLetter("C");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("C5");
        }
    }

    @FXML
    void btnD1Clicked(ActionEvent event) {
        if (sb.isAvailable(btnD1.getStyle()) == true) {
            btnD1.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(1);
            sb.updateSeating();
           // sb.IsSeatAvailable("D1");
        }
    }

    @FXML
    void btnD2Clicked(ActionEvent event) {
        if (sb.isAvailable(btnD2.getStyle()) == true) {
            btnD2.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(2);
            sb.updateSeating();
           // sb.IsSeatAvailable("D2");
        }

    }

    @FXML
    void btnD3Clicked(ActionEvent event) {
        if (sb.isAvailable(btnD3.getStyle()) == true) {
            btnD3.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(3);
            sb.updateSeating();
           // sb.IsSeatAvailable("D3");
        }
    }

    @FXML
    void btnD4Clicked(ActionEvent event) {
        if (sb.isAvailable(btnD4.getStyle()) == true) {
            btnD4.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(4);
            sb.updateSeating();
           // sb.IsSeatAvailable("D4");
        }
    }

    @FXML
    void btnD5Clicked(ActionEvent event) {
        if (sb.isAvailable(btnA3.getStyle()) == true) {
            btnD5.setStyle("-fx-background-color: #434b4d");
            count = count + 1;
            sb.setSeatLetter("D");
            sb.setSeatNumber(5);
            sb.updateSeating();
          //  sb.IsSeatAvailable("D5");
        }
    }

  
    @FXML
    private void SeatMadeAvailable(ActionEvent event) {
    sb.makeAvailable(production.getValue(), MakeAvailable.getText());
    }

    @FXML
    private void SeatMadeUnavailable(ActionEvent event) {
     sb.makeUnAvailable(bookersName.getText(), production.getValue(), MakeUnavailable.getText()); //adds who booked it but it wont work
    }

    @FXML
    private void refundAmount(ActionEvent event) {  //cant open database and lost image of collumn names so i cant code this method
        //merely have to call an update method that i will make in backend and update user accountbalance with amount entered into refund amount
    //sb.ticketPriceCheck(production.getValue());
    
    }

    @FXML
    private void bookersName(ActionEvent event) {  //hover method
    //just enter a value but doesn't do anything 
    }
    
    @FXML
    private void productionChosen(ActionEvent event){
         SQLBackend sb = new SQLBackend();
         String name;
         
         System.out.println(production.getValue());
       
        
        if(production.getValue().equals("macbeth")){ 
          
          sb.setProductionName("Macbeth");
            System.out.println("Prouction Name Set to Macbeth");
           
       }
       else if(production.getValue().equals("feda")){
           sb.setProductionName("Feda");
           System.out.println("Prouction Name Set to Macbeth");
       }
    }
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        sb = new SQLBackend();
        
                
        ObservableList<String> productionList = FXCollections.observableArrayList();
        productionList.add("macbeth");
        productionList.add("feda");
        production.setItems(productionList);
        
        //A1-A5 tooltips
        final Tooltip tooltipA1 = new Tooltip();
        String userID1 = sb.tooltipName(production.getValue());
        tooltipA1.setText(userID1);
        btnA1.setTooltip(tooltipA1);
        
        final Tooltip tooltipA2 = new Tooltip();
        String userID2 = sb.tooltipName(production.getValue());
        tooltipA2.setText(userID2);
        btnA2.setTooltip(tooltipA2);
        
        final Tooltip tooltipA3 = new Tooltip();
        String userID3 = sb.tooltipName(production.getValue());
        tooltipA3.setText(userID3);
        btnA3.setTooltip(tooltipA3);
        
        final Tooltip tooltipA4 = new Tooltip();
        String userID4 = sb.tooltipName(production.getValue());
        tooltipA4.setText(userID4);
        btnA4.setTooltip(tooltipA4);
        
        final Tooltip tooltipA5 = new Tooltip();
        String userID5 = sb.tooltipName(production.getValue());
        tooltipA5.setText(userID5);
        btnA5.setTooltip(tooltipA5);
        
        //B1-B5 Tooltips
         final Tooltip tooltipB1 = new Tooltip();
        String userID6 = sb.tooltipName(production.getValue());
        tooltipB1.setText(userID6);
        btnB1.setTooltip(tooltipB1);
        
        final Tooltip tooltipB2 = new Tooltip();
        String userID7 = sb.tooltipName(production.getValue());
        tooltipB2.setText(userID7);
        btnB2.setTooltip(tooltipB2);
        
        final Tooltip tooltipB3 = new Tooltip();
        String userID8 = sb.tooltipName(production.getValue());
        tooltipB3.setText(userID8);
        btnB3.setTooltip(tooltipB3);
        
        final Tooltip tooltipB4 = new Tooltip();
        String userID9 = sb.tooltipName(production.getValue());
        tooltipB4.setText(userID9);
        btnB4.setTooltip(tooltipB4);
        
        final Tooltip tooltipB5 = new Tooltip();
        String userID10 = sb.tooltipName(production.getValue());
        tooltipB5.setText(userID10);
        btnB5.setTooltip(tooltipB5);
        
         //C1-C5 tooltips
        final Tooltip tooltipC1 = new Tooltip();
        String userID11 = sb.tooltipName(production.getValue());
        tooltipC1.setText(userID11);
        btnC1.setTooltip(tooltipC1);
        
        final Tooltip tooltipC2 = new Tooltip();
        String userID12 = sb.tooltipName(production.getValue());
        tooltipC2.setText(userID12);
        btnC2.setTooltip(tooltipC2);
        
        final Tooltip tooltipC3 = new Tooltip();
        String userID13 = sb.tooltipName(production.getValue());
        tooltipC3.setText(userID13);
        btnC3.setTooltip(tooltipC3);
        
        final Tooltip tooltipC4 = new Tooltip();
        String userID14 = sb.tooltipName(production.getValue());
        tooltipC4.setText(userID14);
        btnC4.setTooltip(tooltipC4);
        
        final Tooltip tooltipC5 = new Tooltip();
        String userID15 = sb.tooltipName(production.getValue());
        tooltipC5.setText(userID15);
        btnC5.setTooltip(tooltipC5);
        
        //D1-D5 Tooltips
         final Tooltip tooltipD1 = new Tooltip();
        String userID16 = sb.tooltipName(production.getValue());
        tooltipD1.setText(userID16);
        btnD1.setTooltip(tooltipD1);
        
        final Tooltip tooltipD2 = new Tooltip();
        String userID17 = sb.tooltipName(production.getValue());
        tooltipD2.setText(userID17);
        btnD2.setTooltip(tooltipD2);
        
        final Tooltip tooltipD3 = new Tooltip();
        String userID18 = sb.tooltipName(production.getValue());
        tooltipD3.setText(userID18);
        btnD3.setTooltip(tooltipD3);
        
        final Tooltip tooltipD4 = new Tooltip();
        String userID19 = sb.tooltipName(production.getValue());
        tooltipD4.setText(userID19);
        btnD4.setTooltip(tooltipD4);
        
        final Tooltip tooltipD5 = new Tooltip();
        String userID20 = sb.tooltipName(production.getValue());
        tooltipD5.setText(userID20);
        btnD5.setTooltip(tooltipD5);
    }
}
