package Test4_Inheritance_abstractclass_interface_30thAp;

public class Developer {
	String devName;
	String devExperience;
	String skills;
	
	public Developer(String devName, String devExperience, String skills) {
		this.devName = devName;
		this.devExperience = devExperience;
		this.skills = skills;
	}
	
	public void debugApp() {
		System.out.println(devName+" is debugging app");
	}
	
	public void integrateCode() {
		System.out.println(devName+" has integrated code with others");
	}
	
	public String toString() {
		return "["+devName+","+devExperience+","+skills+"]";
	}

}
