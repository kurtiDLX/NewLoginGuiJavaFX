package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SingInController extends RegistrationController {
   static String newStrLog = "", newStrPass = "";


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField LoginField;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button confirmButton;

    @FXML
    void initialize() {
        confirmButton.setOnAction(actionEvent -> {
            newStrLog = LoginField.getText();
            newStrPass = PasswordField.getText();
            if (newStrLog.equals(newUser) && newStrPass.equals(newPassword)){
                confirmButton.getScene().getWindow().hide();
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/finalLogin.fxml"));
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage currentStage = (Stage) confirmButton.getScene().getWindow();
                    currentStage.setScene(scene);
                    currentStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

    }

}
