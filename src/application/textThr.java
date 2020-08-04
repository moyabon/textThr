package application;

import text.TextList;

public class textThr {


	public static int textId=0;
	public static StringBuilder sb=new StringBuilder();
	private static  String str;


	 private static void setId(){
	    	textId++;
	    }

	    public static String nextText() {
	    	setId();
	    	return TextList.listCreate().get(textId);
	    }



	    public static String nowText() {
	    	return TextList.listCreate().get(textId);
	    }

	   public static String backLogText() {
		   String log=null;
		   StringBuilder blsb=new StringBuilder();

		   for(int i=15;i>=0;i--) {
		   blsb.append(TextList.listCreate().get(textId-i)+"\r\n");
		   }
		   log=blsb.toString();
		   return log;
		   
	   }

	   public static String getTextId() {
		   str=String.valueOf(textId);
		   return str;
	   }


}
