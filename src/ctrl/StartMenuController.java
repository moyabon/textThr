package ctrl;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startButton;

    @FXML
    private Button quitButton;

    @FXML
    private Button loadButton;

    @FXML
    private Button exButton;

    @FXML
    void onStart(ActionEvent event) {
    	Main.getInstance().newTextWindow();
    }

    @FXML
    void onLoad(ActionEvent event) {
    	Main.getInstance().loadWindow();
    }

    @FXML
    void onEx(ActionEvent event) {
    	Main.getInstance().addFile();
    }

    @FXML
    void onQuit(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void initialize() {
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'startMenu.fxml'.";
        assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'startMenu.fxml'.";
        assert loadButton != null : "fx:id=\"loadButton\" was not injected: check your FXML file 'startMenu.fxml'.";
        assert exButton != null : "fx:id=\"exButton\" was not injected: check your FXML file 'startMenu.fxml'.";

    }
}

