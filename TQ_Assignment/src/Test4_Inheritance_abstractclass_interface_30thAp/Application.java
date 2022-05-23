package Test4_Inheritance_abstractclass_interface_30thAp;

public class Application {
	String version;
	String technology;
	Developer developer;
	
	public Application(String version, String technology, Developer developer) {
		this.version = version;
		this.technology = technology;
		this.developer =  developer;
	}
	
	public void install() {
		System.out.println("application  has installed.");
	}
	
	public void uninstall() {
		System.out.println("unistalled successfully");
	}
	
	public String toString() {
		return "["+version+","+technology+","+developer+"]";
	}

}
