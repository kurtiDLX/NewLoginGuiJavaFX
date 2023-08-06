package sample;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FinalLogin extends SingInController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text passwordFinal;

    @FXML
    private Text userFinal;

    @FXML
    void initialize() {
        String userFin = ("User name: ");
        String passFin = ("User password: ");
        userFinal.setText(userFin + newStrLog);
        passwordFinal.setText(passFin + newStrPass);

    }

}

