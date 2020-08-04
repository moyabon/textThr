package text;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TextList {


	public static ArrayList<String> list = new ArrayList<>();

	public static ArrayList<String> listCreate(){
		StringTokenizer st = new StringTokenizer(Text.text() , "\r\n");{
	}

	    //分割した文字をリストに加える
	    while (st.hasMoreTokens()) {
	       list.add (st.nextToken());
	    }
	    return list;
	}


	 private TextList(){

	}

	public static TextList getInstance() {
		return TextInstance.INSTANCE;
	}

	public static void getList(){

		listCreate();
	}

	public static class TextInstance {
        /** 唯一のインスタンス */
        private static final TextList INSTANCE = new TextList();
    }
}







