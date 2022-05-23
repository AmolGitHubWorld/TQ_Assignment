package Test4_Inheritance_abstractclass_interface_30thAp;

public class WebApplication extends Application{
	public WebApplication(String version, String technology, Developer developer) {
		super(version,technology,developer);
	}
	
	public void install() {
		System.out.println("Web application installed");
	}
	
}
