package week3Day2;

public class Desktop implements HardWare,Software {
	public void desktopModel() {
		System.out.println("The desktop model is Dell Optiplex 380 17 inch (43.18 cms)");
	}

	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
	}

	public void softwareResources() {
		System.out.println("Printing Software Resources");
		
	}

	public void hardwareResources() {
		System.out.println("Printing Hardware Resolurces");
		
	}

}
