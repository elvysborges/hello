package com.ac.elvys;

/**
 * Hello world!
 * 
 */
public class App {
	
	protected String name = null;

	public App() {

	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {

		return name;
	}

	public static void main(String[] args) {
		App app = new App();

		app.setName("wow");
		
		System.out.println("Hello " + app.getName());
	}
}
