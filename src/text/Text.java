package text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Text {

	public static String text;

	public static String text() {
	 try {
         // ファイルのパスを指定する
         File file = new File("text.txt");

         // ファイルが存在しない場合に例外が発生するので確認する
         if (!file.exists()) {
        	 Alert dialog = new Alert(AlertType.ERROR);
     		dialog.setTitle("file does not exist");
     		dialog.setHeaderText(null);
     		dialog.setContentText("実行ファイルと同じフォルダーにtext.txtファイルを設置してください");
     		dialog.showAndWait();
         }

         // BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
         FileInputStream input = new FileInputStream(file);
         InputStreamReader stream = new InputStreamReader(input,"UTF-8");
         BufferedReader buffer = new BufferedReader(stream);
         String data;
         StringBuilder sb =new StringBuilder();
         while ((data=buffer.readLine()) != null) {
             sb.append(data);
             sb.append("\r\n");

         }
         text=sb.toString();

         // 最後にファイルを閉じてリソースを開放する
         buffer.close();


     } catch (IOException e) {
         e.printStackTrace();
     }
	 return text;
}
	}
