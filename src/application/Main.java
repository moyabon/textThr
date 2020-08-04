package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static Main singleton;
	public Parent textWindow;
	public Parent backLog;
	public Parent startMenu;
	public Parent saveWindow;
	public Parent loadWindow;
	public Parent addFile;

	private Stage stage;
	private Scene textWindowRoot;
	private Scene backLogRoot;
	private Scene startMenuRoot;
	private Scene saveWindowRoot;
	private Scene loadWindowRoot;
	private Scene addFileRoot;




	@Override
	public void start(Stage primaryStage) {
		try {
			singleton=this;
			stage=primaryStage;
			backLog= FXMLLoader.load(
                    getClass().getResource( "backLog.fxml"));
			startMenu=FXMLLoader.load(
                    getClass().getResource( "startMenu.fxml"));
			textWindow = FXMLLoader.load(
                    getClass().getResource( "textWindow.fxml"));

			saveWindow = FXMLLoader.load(
                    getClass().getResource( "saveWindow.fxml"));
			loadWindow = FXMLLoader.load(
                    getClass().getResource( "loadWindow.fxml"));
			addFile= FXMLLoader.load(
                    getClass().getResource( "addFile.fxml"));


			stage.setTitle("textThr");
			Scene sceneA =new Scene(addFile);
			Scene sceneB = new Scene(backLog);
			Scene sceneC =new Scene(startMenu);
			Scene sceneD = new Scene(textWindow);
			Scene sceneE = new Scene(saveWindow);
			Scene sceneF = new Scene(loadWindow);


			setStage();
			setBackLogStage();
			setStartMenuStage();
			setSaveWindowStage();
			setLoadWindowStage();
			setAddFileStage();

			sceneA.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			sceneB.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			sceneC.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			sceneD.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			sceneE.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			sceneF.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            stage.setScene(sceneC);
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void textWindow() {
		try {
            stage.setScene(textWindowRoot);
        } catch (Exception e) {
            e.printStackTrace();
	}}

	public void newTextWindow() {
		try {
            textWindow = FXMLLoader.load(getClass().getResource("textWindow.fxml"));
            stage.setTitle("textWindow");
            stage.setScene(new Scene(textWindow));
            setStage();
            stage.setScene(textWindowRoot);
        } catch (Exception e) {
            e.printStackTrace();
	}}

public void backLog() {
	try {
        backLog = FXMLLoader.load(getClass().getResource("backLog.fxml"));
        stage.setTitle("textWindow");
        stage.setScene(new Scene(backLog));
        setStage();
        stage.setScene(backLogRoot);
    } catch (Exception e) {
        e.printStackTrace();
}}

public void startMenu() {
	try {
        stage.setScene(startMenuRoot);
    } catch (Exception e) {
        e.printStackTrace();
}}

public void saveWindow() {
	try {
        stage.setScene(saveWindowRoot);
    } catch (Exception e) {
        e.printStackTrace();
}}


public void loadWindow() {
	try {
        stage.setScene(loadWindowRoot);
    } catch (Exception e) {
        e.printStackTrace();
}}

public void addFile() {
	try {
        stage.setScene(addFileRoot);
    } catch (Exception e) {
        e.printStackTrace();
}}

private void setStage() {
    textWindowRoot= (Scene) textWindow.getScene();
}

private void setBackLogStage() {
    backLogRoot= (Scene) backLog.getScene();
}

private void setStartMenuStage() {
	startMenuRoot=(Scene) startMenu.getScene();
}

private void setSaveWindowStage() {
	saveWindowRoot=(Scene) saveWindow.getScene();
}

private void setLoadWindowStage() {
	loadWindowRoot=(Scene) loadWindow.getScene();
}

private void setAddFileStage() {
	addFileRoot=(Scene) addFile.getScene();
}


	 public  static Main getInstance(){
	        return singleton;
	    }

}

