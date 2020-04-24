package se.kth.iv1350.amazingpos.view;

import se.kth.iv1350.amazingpos.controller.Controller;
/*
 * This is a placeholder for the real view. It contains a hardcoded execution with calls to all system operations
 * in the controller.
 */
public class view {
	private Controller ctrl;
	/*
	 * Creates a new instance, that uses the specified controller for calls to other layers.
	 * 
	 * @param ctrl The controller to use for all calls to other layers.
	 */
	public view (Controller ctrl) {

		this.ctrl = ctrl;
	}
	/*
	 * Performs a fake sale, by calling all system operations in the controller.
	 */
	public void runFakeExecution() {
		ctrl.startSale();
		System.out.println("A new sale has been started.");
	}
}
