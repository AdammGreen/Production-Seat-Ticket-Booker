package itpat;

import static java.awt.SystemColor.window;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FirstPageController {

    SQLBackend sb;
    
    @FXML
    private Button btnAdmin;

    @FXML
    private Button btnHelp;

    @FXML
    private Button btnStudent;

    @FXML
    void adminClicked(ActionEvent event) throws IOException {
        System.out.println("btnAdmin clicked");

       SQLBackend m = new SQLBackend();
       m.setUsertype("Admin");

        
        Parent login_screen_parent = FXMLLoader.load(getClass().getResource("FXMLLoginScreen.fxml"));
        Scene login_screen_scene = new Scene(login_screen_parent);
        Stage login_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        login_screen_stage.hide();
        login_screen_stage.setScene(login_screen_scene);
        login_screen_stage.show();

    }

    @FXML
    void studentClicked(ActionEvent event) throws IOException { 
        System.out.println("btnStudent clicked");
        SQLBackend m = new SQLBackend();
       m.setUsertype("Student");
        
        Parent login_screen_parent = FXMLLoader.load(getClass().getResource("FXMLLoginScreen.fxml"));
        Scene login_screen_scene = new Scene(login_screen_parent);
        Stage login_screen_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        login_screen_stage.hide();
        login_screen_stage.setScene(login_screen_scene);
        login_screen_stage.show();

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

    public void initialize(URL url, ResourceBundle rb) {
        sb = new SQLBackend();
    }


}
