package Test4_Inheritance_abstractclass_interface_30thAp;

import Test4_Inheritance_abstractclass_interface_30thAp.Application;
import Test4_Inheritance_abstractclass_interface_30thAp.Developer;

public class MobileApplication extends Application{
	public MobileApplication(String version, String technology, Developer developer) {
		super(version,technology,developer);
	}
}
