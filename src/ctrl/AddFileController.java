package ctrl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class AddFileController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button textButton;

    @FXML
    private MenuItem toMain;

    @FXML
    private Button createButton;

    @FXML
    private TextArea txtFileText;

    @FXML
    private Button pdfButton;

    @FXML
    private TextField pdfFileText;

    //@FXML
    //private Menu quitMenu;

    @FXML
    private MenuItem quitMenu;

	private Window stage;

	public List<File> textFiles;




    @FXML
    void onToMain(ActionEvent event) {

    	Main.getInstance().startMenu();
    	text.TextList.getList();
    }


    @FXML
    void onQuitMenu(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void onPdfButton(ActionEvent event) {

    }

    @FXML
    void onTextButton(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
    	 fileChooser.setTitle( "ファイル選択" );
    	 fileChooser.setInitialDirectory( new File(System.getProperty("user.dir")) );
    	 //fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
    	 fileChooser.getExtensionFilters().add( new FileChooser.ExtensionFilter( "テキストファイル", "*.txt" ) );
    	 textFiles = fileChooser.showOpenMultipleDialog( this.stage );
    	 if (textFiles != null) {
    	  StringBuilder sb =new StringBuilder();
    	  for(File f:textFiles) {
    		  sb.append(f.getName().toString());
    		  //getPath()の代わり getPathは長い
    		  sb.append(",");
    	  }
    	  String filenames=sb.toString();
    	  this.txtFileText.setText( filenames );
    	 }
    	}




    @FXML
    void onCreateButton(ActionEvent event) {
    	if(textFiles!=null) {
    		try {
    			String text;
    			String data;
		         StringBuilder sb =new StringBuilder();

    			for(File f:textFiles) {
    				FileInputStream input = new FileInputStream(f);
    	            InputStreamReader stream = new InputStreamReader(input,"UTF-8");
    	            BufferedReader buffer = new BufferedReader(stream);
    		         while ((data=buffer.readLine()) != null) {
    		             sb.append(data);
    		             sb.append("\r\n");
    		             }
    		         buffer.close();
    		         }

    			//file write
                text=sb.toString();
                File textFile = new File("text.txt");
                PrintWriter p_writer = new PrintWriter(new BufferedWriter
                				(new OutputStreamWriter(new FileOutputStream(textFile),"UTF-8")));
                if(!textFile.exists()) {
                	try{
            		    textFile.createNewFile();
            		    p_writer.write(text);
            		    p_writer.close();
            		}catch(IOException e){
            			e.printStackTrace();
            		}
                }else {
                	p_writer.write(text);
                	p_writer.close();
            }} catch (IOException e) {
                //dialog
            }
    	}
    	else {
    		Alert dialog = new Alert(AlertType.ERROR);
    		dialog.setTitle("file does not exist");
    		dialog.setHeaderText(null);
    		dialog.setContentText("ファイルを選択してください");
    		dialog.showAndWait();
    	}
    }

    @FXML
    void initialize() {
        assert textButton != null : "fx:id=\"textButton\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert toMain != null : "fx:id=\"toMain\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert createButton != null : "fx:id=\"createButton\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert txtFileText != null : "fx:id=\"txtFileText\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert pdfButton != null : "fx:id=\"pdfButton\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert pdfFileText != null : "fx:id=\"pdfFileText\" was not injected: check your FXML file 'AddFile.fxml'.";
        assert quitMenu != null : "fx:id=\"quitMenu\" was not injected: check your FXML file 'AddFile.fxml'.";

    }
}

