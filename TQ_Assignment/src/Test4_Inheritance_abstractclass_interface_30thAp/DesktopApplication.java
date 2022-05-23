package Test4_Inheritance_abstractclass_interface_30thAp;

public class DesktopApplication extends Application {
	public DesktopApplication(String version, String technology, Developer developer) {
		super(version,technology,developer);
	}
	
	public void install() {
		System.out.println("Desktop application installed");
	}
}
