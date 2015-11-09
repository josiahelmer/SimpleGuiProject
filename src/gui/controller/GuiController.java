package gui.controller;

import gui.view.GuiFrame;
/**
 * AppController for the simple GUI project
 * @author jelm9149
 * @version 0.1 Nov 9, 2015
 */
public class GuiController
{
	/**
	 * Reference to the GUIFrame object of the view.
	 */
	private GuiFrame baseFrame;
	
	public GuiController()
	{
		baseFrame = new GuiFrame(this);
	}

	public void start()
	{
				
	}
}

