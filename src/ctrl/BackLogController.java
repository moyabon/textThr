package ctrl;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.textThr;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.VBox;


public class BackLogController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox backLogWindow;

    @FXML
    private TextArea backLogText;

    @FXML
    public void onBackLogText() {

    	backLogText.setText(textThr.backLogText());
    }



    @FXML
    void onBackLogScroll(ScrollEvent event) {

    if(event.getDeltaY()<0) {
    	Main.getInstance().textWindow();

	} else{
		onBackLogText();
			}
	}

    @FXML
    void onBackLogMouseClicked(MouseEvent e) {

    	    if (e.getButton()== MouseButton.SECONDARY){
    	    	Main.getInstance().textWindow();
    	      }else {

    	      }
        }

    @FXML
    public void initialize() {
    assert backLogText != null : "fx:id=\"backLogText\" was not injected: check your FXML file 'backLog.fxml'.";
    assert backLogWindow != null : "fx:id=\"backLogWindow\" was not injected: check your FXML file 'backLog.fxml'.";

    
    }

}