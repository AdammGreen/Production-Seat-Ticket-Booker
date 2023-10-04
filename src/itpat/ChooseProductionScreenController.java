package itpat;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ChooseProductionScreenController implements Initializable {
    
    @FXML
    private Button btnNext;

    @FXML
    private ImageView SJC;

    @FXML
    private ChoiceBox<String> productionDropdown;

    @FXML
    private ChoiceBox<String> dateDropdown;

    @FXML
    private Button btnHelp;
    
    @FXML
    private Label helloMessage;
   
    
   

    @FXML
    void nextClicked(ActionEvent event) throws IOException {
        System.out.println("Next Clicked");
        Parent seat_screen_parent = FXMLLoader.load(getClass().getResource("ChooseSeatScreen.fxml"));
        Scene seat_screen_scene = new Scene(seat_screen_parent);
        Stage seat_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        seat_screen_stage.hide();
        seat_screen_stage.setScene(seat_screen_scene);
        seat_screen_stage.show();
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
    private void productionChosen(ActionEvent event){
         SQLBackend sb = new SQLBackend();
         String name;
         
         System.out.println(productionDropdown.getValue());
       
        
        if(productionDropdown.getValue().equals("macbeth")){ 
          
          sb.setProductionName("Macbeth");
            System.out.println("Prouction Name Set to Macbeth");
           
       }
       else if(productionDropdown.getValue().equals("feda")){
           sb.setProductionName("Feda");
           System.out.println("Prouction Name Set to Macbeth");
       }
      
         if(productionDropdown.getValue().equals("macbeth")){     //this is so that each porduction has different dates to choose from
        ObservableList<String> dateList = FXCollections.observableArrayList();
        dateList.add("2019/04/19");
        dateDropdown.setItems(dateList);
       // sb.updateProductionScreen("macbeth","1"); //need to actually be able to call the userID. That 1 is just a test variable
        
       } 
        
        else if(productionDropdown.getValue().equals("feda")){
        ObservableList<String> dateList = FXCollections.observableArrayList();
        dateList.add("2019/04/20");
        dateDropdown.setItems(dateList);
       // sb.updateProductionScreen("feda","2");//need to actually be able to call the userID. That 1 is just a test variable
        }  
       
     
    }
    
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        SQLBackend sb = new SQLBackend();
        
        ObservableList<String> productionList = FXCollections.observableArrayList();
        productionList.add("macbeth");
        productionList.add("feda");
        productionDropdown.setItems(productionList);
        
       
        String result = sb.getUsername();
        System.out.println("Returned msg: " + result);
        
        
        helloMessage.setText("Hello " + result);
         
    }
    
    

}
