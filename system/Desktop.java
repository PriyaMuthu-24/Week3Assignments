package org.system;

public class Desktop extends Computer {
	
	public void desktopsize() {
		System.out.println("Printing Desktop Size");
		
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.desktopsize();
		
		desk.computerModel();
		
	}

}
