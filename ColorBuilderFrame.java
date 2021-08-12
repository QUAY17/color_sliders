package colors;
/*****************************************************************
*Jennifer Minnich jminnich@cnm.edu
*
*ColorBuilderFrame.java
*
*class to run the program
*******************************************************************/

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorBuilderFrame extends JFrame
{
	private JButton jbtButton;
	private ColorBuilder cbobj;
	private  JLabel lblRed;
	private JSlider slRed;
	private JLabel lblGreen;
	private JSlider slGreen;
	private JLabel lblBlue;
	private JSlider slBlue;
	private JLabel lblColor;
	String cbDesc;
	private int red;
	private int green;
	private int blue;
	
	public ColorBuilderFrame(ColorBuilder builder)
	{

		cbobj = new ColorBuilder(red, green, blue); // JM new instance ColorBuilder stored into variable
		Color mc = cbobj.getTheColor();
		Color cc = cbobj.getTheComplementColor();
		int cbBlue = mc.getBlue(); //JM fix color RED -> BLUE
		int cbGreen = mc.getGreen();
		int cbRed = mc.getRed(); //JM fix color BLUE -> RED
		cbDesc = cbobj.toString();

		//make the container
		GridLayout wcgrid = new GridLayout(7, 1);
		setLayout(wcgrid);
		//create the components 
		lblRed = new JLabel("Red: " + cbRed, JLabel.CENTER); //JM need semicolon at end of statement
		slRed = new JSlider(0, 255, cbRed);
		slRed.setPaintTicks(true);
		slRed.setPaintLabels(true);
		slRed.setMajorTickSpacing(15);
		slRed.setMinorTickSpacing(5);
		slRed.setValue(0);
		
		lblGreen = new JLabel("Green: " + cbGreen, JLabel.CENTER);
		slGreen = new JSlider(0, 255, cbGreen);
		slGreen.setPaintTicks(true);
		slGreen.setPaintLabels(true);
		slGreen.setMajorTickSpacing(15);
		slGreen.setMinorTickSpacing(5);
		slGreen.setValue(0);
		
		lblBlue = new JLabel("Blue: " + cbBlue, JLabel.CENTER);
		slBlue = new JSlider(0, 255, cbBlue);
		slBlue.setPaintTicks(true);
		slBlue.setPaintLabels(true);
		slBlue.setMajorTickSpacing(15);
		slBlue.setMinorTickSpacing(5);
		slBlue.setValue(0); //JM set value of tick to slider
		
		JLabel lblColor = new JLabel(cbDesc, JLabel.CENTER);
		lblColor.setForeground(cc);
		lblColor.setBackground(mc);
		lblColor.setOpaque(true); //JM JLabel background color set to true to display

		//adding the components to the frame.
		add(lblRed);
		add(slRed);
		add(lblGreen);
		add(slGreen);
		add(lblBlue);
		add(slBlue);
		add(lblColor);
		
		//JM rename listeners to correct colors!
		slRed.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				int redVal = slRed.getValue();
				cbobj.setRed(redVal);
				Color bc = cbobj.getTheColor(); //background color is The Color
				Color fc = cbobj.getTheComplementColor(); //font color complements
				cbDesc = cbobj.toString();
				lblRed.setText("Red: " + redVal);
				lblColor.setText(cbDesc);
				lblColor.setForeground(fc);
				lblColor.setBackground(bc);
			}
		});
		slGreen.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent f)
			{
				int greenVal = slGreen.getValue();
				cbobj.setGreen(greenVal);
				Color bc = cbobj.getTheColor(); //background color is The Color
				Color fc = cbobj.getTheComplementColor(); //font color complements
				cbDesc = cbobj.toString();
				lblGreen.setText("Green: " + greenVal);
				lblColor.setText(cbDesc);
				lblColor.setForeground(fc);
				lblColor.setBackground(bc);
			}
		});
		slBlue.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent g)
			{
				int blueVal = slBlue.getValue();
				cbobj.setBlue(blueVal);
				Color bc = cbobj.getTheColor(); //background color is The Color
				Color fc = cbobj.getTheComplementColor(); //font color complements
				cbDesc = cbobj.toString();
				lblBlue.setText("Blue: " + blueVal);
				lblColor.setText(cbDesc);
				lblColor.setForeground(fc);
				lblColor.setBackground(bc);
			}
		});

	}

		
}		
		
		
		
		
	