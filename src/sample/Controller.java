package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button registrationButton;

    @FXML
    private Button signButton;

    @FXML
    void initialize() {
          registrationButton.setOnAction(actionEvent -> {
                registrationButton.getScene().getWindow().hide();

              FXMLLoader loader = new FXMLLoader();
              loader.setLocation(getClass().getResource("/sample/registration.fxml"));
              try {
                  loader.load();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              Parent root = loader.getRoot();
              Stage stage = new Stage();
              stage.setScene(new Scene(root));
              stage.showAndWait();
          });

          signButton.setOnAction(actionEvent -> {
              signButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("signIn.fxml"));
              try {
                  loader.load();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              Parent root = loader.getRoot();
              Stage stage = new Stage();
              stage.setScene(new Scene(root));
              stage.show();

          });
    }

}
