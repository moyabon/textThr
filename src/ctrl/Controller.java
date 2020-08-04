package ctrl;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.textThr;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.FlowPane;

public class Controller {

	public static Controller singleton;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private FlowPane textWindow;

    @FXML
    private FlowPane window;

    @FXML
    private TextArea text;

    @FXML
    private MenuItem menuStartMenu;

    @FXML
    private MenuItem menuStartWindow;

    @FXML
    private MenuItem menuQuit;

    @FXML
    private MenuItem menuSave;

    @FXML
    private MenuItem menuLoad;






    @FXML
    public void onNowText() {

    	text.setText(textThr.nowText());
    }

    @FXML
    void onClicked(MouseEvent event) {
    	if (event.getButton()== MouseButton.SECONDARY){
	    	Main.getInstance().backLog();
	      }else {
	    	  text.setText(textThr.nextText());
	      }
    }


    @FXML
    void onScroll(ScrollEvent event) {
    	if(event.getDeltaY()<0) {
    		nextText();
    	} else{
    		
    		application.Main.getInstance().backLog();
    		
    	}
    }
    @FXML
    void nextText() {

    	String value=textThr.nextText();
    	text.setText(value);
    }


    @FXML
    void onTextClicked(MouseEvent event) {
    	String value=textThr.nextText();
    	text.setText(value);

    }

    @FXML
    void onTextScroll(ScrollEvent event) {
    	String value=textThr.nextText();
    	text.setText(value);

    }

    @FXML
    void onMenuStartMenu(ActionEvent event) {
    	Main.getInstance().startMenu();
    }

    @FXML
    void onMenuQuit(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void onMenuSave(ActionEvent event) {
    	Main.getInstance().saveWindow();
    }
    @FXML
    void onMenuLoad(ActionEvent event) {
    	Main.getInstance().loadWindow();
    }

    @FXML
    public  static Controller getInstance(){
        return singleton;
    }


    @FXML
    public void initialize() {
        assert textWindow != null : "fx:id=\"textWindow\" was not injected: check your FXML file 'textWindow.fxml'.";
        assert window != null : "fx:id=\"window\" was not injected: check your FXML file 'textWindow.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'textWindow.fxml'.";

        onNowText();
    }

    }


