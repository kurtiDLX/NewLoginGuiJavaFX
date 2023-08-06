package sample;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {
    static String newUser = ("");
    static String newPassword = ("");

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button confirmButton;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private TextField newLoginField;

    @FXML
    private TextField newPasswordField;

    @FXML
    void initialize() {
        confirmButton.setOnAction(actionEvent -> {
            newUser = newLoginField.getText();
            newPassword = newPasswordField.getText();
            System.out.println("new user: " + newUser + " was created\n");


            confirmButton.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/sample.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage currentStage = (Stage) confirmButton.getScene().getWindow();
                currentStage.setScene(scene);
                currentStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
