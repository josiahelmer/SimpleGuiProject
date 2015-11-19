package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * Creates the Framefor the Gui project.
 * @author jelm9149
 * @version 0.3 Nov 9, 2015 Added a reference to the GuiPanel and installed it as the content pane.
 * Added the setupFrame helper method
 */

public class GuiFrame extends JFrame
{

	private GuiController baseController;
	private GuiPanel basePanel;
	
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //assign paramter to data member
		basePanel = new GuiPanel(baseController); //Create an instanve of the GuiPanel with a reference to the controller
		setupFrame();

	}
	
	/**
	 * Helper method to setup the Frame and its structure.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);		//Sets the panel in the GuiFrame, this is Required
		this.setResizable(false);			//Usually a good idea but not required
		this.setSize(400,400);				//Sets the size.
		this.setVisible(true);				//Must be the last line of code in the setupFrame method.
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}
}
