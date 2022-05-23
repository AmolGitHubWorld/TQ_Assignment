package Test4_Inheritance_abstractclass_interface_30thAp;

import Test4_Inheritance_abstractclass_interface_30thAp.MobileApplication;

public class ApplicationMain {

	public static void main(String[] args) {
		Developer dev = new Developer("Anand", "3", "j2se eclipse");
		DesktopApplication da = new DesktopApplication("1.7", "j2se", dev);
		System.out.println(da);
		
		Developer dev1 = new Developer("phatechand", "2", "java full stack");
		WebApplication wa = new WebApplication("2.4.6", "Springboot mysql eclipse",dev1);
		System.out.println(wa);
		
		Developer dev2 = new Developer("chand", "4", "Android development");
		MobileApplication ma = new MobileApplication("1.12.4", "android intellij", dev2);
		System.out.println(ma);

	}

}
