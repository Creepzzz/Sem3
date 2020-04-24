package se.kth.iv1350.amazingpos.startup;
import se.kth.iv1350.amazingpos.controller.Controller;
import se.kth.iv1350.amazingpos.view.*;
/*
 * Starts the entire application, contains the main method used to start the application.
 */
public class Main {
	/*
	 * The main method used to start the entire application.
	 * 
	 * @param args The application does not take any command line parameters.
	 */
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		new view(ctrl).runFakeExecution();
		
	}

}
