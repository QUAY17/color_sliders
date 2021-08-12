package colors;
/*****************************************************************
*Jennifer Minnich jminnich@cnm.edu
*
*ColorBuilder.java
*
*class to run the program
*******************************************************************/

import java.awt.Color;

public class ColorBuilder
{
	private int red;
	private int green;
	private int blue;
	private int cRed, cGreen, cBlue;

	
	public ColorBuilder()
	{
		red = 0;
		green = 0;
		blue = 0;

	}
	
	public ColorBuilder(int red, int green, int blue)
	{

		red = this.red;
		green = this.green;
		blue = this.blue;

	}
	
	//Set red value
	public void setRed(int r){
		red = r;

	}
	
	//Set green value
	public void setGreen(int g){
		green = g;

	}
	
	//Set blue value
	public void setBlue(int b){
		blue = b;

	}

	//Returns the color
	public Color getTheColor()
	{
		Color temp = new Color(red, blue, green);
		return temp;
	}

	public Color getTheComplementColor()
	{
		//if it's mid-grey, make the complementary color black.
		if (red < 170 && red > 100 && green < 170 && green > 100 &&
				blue < 170 && blue > 100)
		{
			cRed = 255;
			cGreen = 255;
			cBlue = 255;
		}
		else		//otherwise, find the actual complement
					// JM 255 - RGB value for complement
		{
			cRed = 255 - red;
			cGreen = 255 - green;
			cBlue = 255 - blue;
		}
		Color compColor = new Color(cRed, cGreen, cBlue); // use complement variable
	
	return compColor;
	}
	@Override

	public String toString()
	{
		return "Red: " + red + " Green: " + green + " Blue: " + blue;
	}
}

	
	
	
	
	
	
	
	
	

	