package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.controller.GuiController;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;

/**
 * 
 * @author jelm9149
 * @version 0.1 Nove 9, 2015 Basic constructor setup.
 */

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button");
		firstTextField = new JTextField("You can type words in here");
	
	setupPanel();
	setupLayout();
	setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
		{	
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 81, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 129, SpringLayout.WEST, this);
		}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("don't click it");
			}
		});
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
//				changeRandomColor();
				if(SwingUtilities.isLeftMouseButton(clicked))
				{
					firstTextField.setText("you are using the left click");
				}
				else if(SwingUtilities.sRightMouseButton(clicked))
				{
					firstTextField.setText("you right clicked");
				}
			}
			public void mouseEntered(MouseEvent entered)
			{
//				changeRandomColor();
			}
			public void mouseExited(MouseEvent exited)
			{
//				changeRandomColor();
			}
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			public void mousePressed(MouseEvent pressed)
			{
				
			}
		});
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				firstButton.setText("Mouse X:" + moved.getX() + " Mouse Y:"  +moved.getY());	
				
				if((moved.getX() > 25 && moved.getX() < 40) && (moved.getY() > 5 && moved.getY() < 70))
				{
					changeRandomColor();
					
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				if(dragged.isAltDown())
				{
					firstTextField.setText("you held alt and dragged!");
				}
			}
			
		});
	}
	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
	}
}
