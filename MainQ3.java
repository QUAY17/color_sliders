package colors;
/*****************************************************************
*Jennifer Minnich jminnich@cnm.edu
*
*Main.java
*
*class to run the program
*******************************************************************/
import javax.swing.JFrame;

public class MainQ3
{
	
	public static void main(String[] args)
	{
		ColorBuilder builder = new ColorBuilder(); // JM new instance of ColorBuilder
		ColorBuilderFrame frame = new ColorBuilderFrame(builder);// JM builder needed to be initialized
		frame.setTitle("Jennifer Minnich ColorBuilder - Quiz 3");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true); // JM needs this statement to show frame

	}
}

		