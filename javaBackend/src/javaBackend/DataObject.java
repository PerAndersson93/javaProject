package javaBackend;

public class DataObject {
	private String language;
	private String info;
	private int positionX;
	private int positionY;
	private DataObject parent;
	private DataObject[] children;
	
	public DataObject(String _language){
		language = _language;
	}
	
	public String getLanguage() {
		return language;
	}
	
	//System.out.println("Initiating interface");
}
