package myProgram;

public class LanguageEg implements Frontend,Backend{
	
	public void responsive(String lang) {
		System.out.println(lang  + " This is used for creating responsive website.");
	}
	
	public void connectServer(String lang) {
		System.out.println(lang + " This is used for creating connecting to the setver.");
	}
	public static void main(String[] args) {
		LanguageEg l = new LanguageEg();
		l.connectServer("Java");
		l.responsive("Bootstrap");
	}

}
