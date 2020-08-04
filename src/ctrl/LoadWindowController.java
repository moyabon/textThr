package ctrl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.textThr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class LoadWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button load3;

    @FXML
    private Button load2;

    @FXML
    private Button load5;

    @FXML
    private Button load4;

    @FXML
    private Button load1;

    @FXML
    private Button toMenu;

    @FXML
    private Button toTextWindow;

    private int num;

    @FXML
    void onLoad1(ActionEvent event) throws IOException{
    	File file = new File("save1.txt");
    	if(!file.exists()) {
    		Alert dialog = new Alert(AlertType.ERROR);
    		dialog.setTitle("file does not exist");
    		dialog.setHeaderText(null);
    		dialog.setContentText("ファイルが見つかりません");
    		dialog.showAndWait();
    	}else {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	 String text;
    	 while ((text = br.readLine()) != null) {
    		this.num = Integer.parseInt(text);
    	 }
    	}
    	textThr.textId=num;

    	Main.getInstance().newTextWindow();

    }}


    @FXML
    void onLoad2(ActionEvent event) throws IOException{
    	File file = new File("save2.txt");
    	if(!file.exists()) {
    		//TODO ダイアログ
    	}else {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	 String text;
    	 while ((text = br.readLine()) != null) {
    		this.num = Integer.parseInt(text);
    	 }
    	}
    	textThr.textId=num;

    	Main.getInstance().newTextWindow();

    }}

    @FXML
    void onLoad3(ActionEvent event) throws IOException{
    	File file = new File("save3.txt");
    	if(!file.exists()) {
    		Alert dialog = new Alert(AlertType.ERROR);
    		dialog.setTitle("file does not exist");
    		dialog.setHeaderText(null);
    		dialog.setContentText("ファイルが見つかりません");
    		dialog.showAndWait();
    	}else {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	 String text;
    	 while ((text = br.readLine()) != null) {
    		this.num = Integer.parseInt(text);
    	 }
    	}
    	textThr.textId=num;

    	Main.getInstance().newTextWindow();

    }}

    @FXML
    void onLoad4(ActionEvent event) throws IOException{
    	File file = new File("save4.txt");
    	if(!file.exists()) {
    		Alert dialog = new Alert(AlertType.ERROR);
    		dialog.setTitle("file does not exist");
    		dialog.setHeaderText(null);
    		dialog.setContentText("ファイルが見つかりません");
    		dialog.showAndWait();
    	}else {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	 String text;
    	 while ((text = br.readLine()) != null) {
    		this.num = Integer.parseInt(text);
    	 }
    	}
    	textThr.textId=num;

    	Main.getInstance().newTextWindow();

    }}

    @FXML
    void onLoad5(ActionEvent event) throws IOException{
    	File file = new File("save5.txt");
    	if(!file.exists()) {
    		Alert dialog = new Alert(AlertType.ERROR);
    		dialog.setTitle("file does not exist");
    		dialog.setHeaderText(null);
    		dialog.setContentText("ファイルが見つかりません");
    		dialog.showAndWait();
    	}else {
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    	 String text;
    	 while ((text = br.readLine()) != null) {
    		this.num = Integer.parseInt(text);
    	 }
    	}
    	textThr.textId=num;

    	Main.getInstance().newTextWindow();

    }}

    @FXML
    void onToMenu(ActionEvent event) {
    	Main.getInstance().startMenu();
    }

    @FXML
    void onToTextWindow(ActionEvent event) {
    	Main.getInstance().textWindow();
    }


    @FXML
    void initialize() {
        assert load3 != null : "fx:id=\"load3\" was not injected: check your FXML file 'loadWindow.fxml'.";
        assert load2 != null : "fx:id=\"load2\" was not injected: check your FXML file 'loadWindow.fxml'.";
        assert load5 != null : "fx:id=\"load5\" was not injected: check your FXML file 'loadWindow.fxml'.";
        assert load4 != null : "fx:id=\"load4\" was not injected: check your FXML file 'loadWindow.fxml'.";
        assert load1 != null : "fx:id=\"load1\" was not injected: check your FXML file 'loadWindow.fxml'.";

    }
}
