package ctrl;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.textThr;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SavaWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button toTextWindow;

    @FXML
    private Button toMenu;

    @FXML
    private Button save3;

    @FXML
    private Button save4;

    @FXML
    private Button save1;

    @FXML
    private Button save2;

    @FXML
    private Button save5;


    @FXML
    void onSave1(ActionEvent event) {
    	File file = new File("save1.txt");
    	if(!file.exists()) {
    		try{
    		    file.createNewFile();
    		    FileWriter filewriter = new FileWriter(file);            filewriter.write(textThr.getTextId());
                filewriter.close();
    		}catch(IOException e){
    			e.printStackTrace();
    		}

    	}else {
    	try {
            FileWriter filewriter = new FileWriter(file);

            filewriter.write(textThr.getTextId());
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }}

    @FXML
    void onSave2(ActionEvent event) {
    	File file = new File("save2.txt");
    	if(!file.exists()) {
    		try{
    		    file.createNewFile();
    		    FileWriter filewriter = new FileWriter(file);            filewriter.write(textThr.getTextId());
                filewriter.close();
    		}catch(IOException e){
    			e.printStackTrace();
    		}
    	}else {
    	try {
            FileWriter filewriter = new FileWriter(file);

            filewriter.write(textThr.getTextId());
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    @FXML
    void onSave3(ActionEvent event) {
    	File file = new File("save3.txt");
    	if(!file.exists()) {
    		try{
    		    file.createNewFile();
    		    FileWriter filewriter = new FileWriter(file);            filewriter.write(textThr.getTextId());
                filewriter.close();
    		}catch(IOException e){
    			e.printStackTrace();
    		}
    	}else {
    	try {
            FileWriter filewriter = new FileWriter(file);

            filewriter.write(textThr.getTextId());
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    @FXML
    void onSave4(ActionEvent event) {
    	File file = new File("save4.txt");
    	if(!file.exists()) {
    		try{
    		    file.createNewFile();
    		    FileWriter filewriter = new FileWriter(file);            filewriter.write(textThr.getTextId());
                filewriter.close();
    		}catch(IOException e){
    			e.printStackTrace();
    		}
    	}else {
    	try {
            FileWriter filewriter = new FileWriter(file);

            filewriter.write(textThr.getTextId());
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

    @FXML
    void onSave5(ActionEvent event) {
    	File file = new File("save5.txt");
    	if(!file.exists()) {
    		try{
    		    file.createNewFile();
    		    FileWriter filewriter = new FileWriter(file);            filewriter.write(textThr.getTextId());
                filewriter.close();
    		}catch(IOException e){
    			e.printStackTrace();
    		}
    	}else {
    	try {
            FileWriter filewriter = new FileWriter(file);

            filewriter.write(textThr.getTextId());
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
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
        assert save3 != null : "fx:id=\"save3\" was not injected: check your FXML file 'Untitled'.";
        assert save4 != null : "fx:id=\"save4\" was not injected: check your FXML file 'Untitled'.";
        assert save1 != null : "fx:id=\"save1\" was not injected: check your FXML file 'Untitled'.";
        assert save2 != null : "fx:id=\"save2\" was not injected: check your FXML file 'Untitled'.";
        assert save5 != null : "fx:id=\"save5\" was not injected: check your FXML file 'Untitled'.";
        }
}


