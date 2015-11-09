package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

public class GuiFrame extends JFrame
{

	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //assign paramter to data member
		setupFrame();

	}
	private void setupFrame()
	{
		this.setResizable(false);	//Usually a good idea but not required
		this.setSize(400,400);		//Sets the size.
		this.setVisible(true);		//Must be the last line of code in the setupFrame method.
	}
}
