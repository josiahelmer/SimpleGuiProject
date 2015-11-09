package gui.view;

import javax.swing.JPanel;
import gui.controller.GuiController;
/**
 * 
 * @author jelm9149
 * @version 0.1 Nove 9, 2015 Basic constructor setup.
 */

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
	}

}
