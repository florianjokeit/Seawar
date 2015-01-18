import processing.core.*;

public class seawar extends PApplet
{
	SeawarGrid sw1 = new SeawarGrid(this);
	SeawarGrid sw2 = new SeawarGrid(this);
	Logic lc = new Logic();
	
	public void setup()
	{
		size(1200,700);
		textSize(30);
		//Nachschauen prevent Resize
	}
		
	public void draw()
	{
		background(128);
		sw1.displayGrid(75, 50, 50, lc.getGridLeft());
		sw2.displayGrid(650, 50, 50,lc.getGridRight());
		sw1.displayLabels(20,50,10);
		sw2.displayLabels(600, 50,10);
	}
	
	public void mousePressed()
	{
		int xPos = lc.mapX(0, lc.getGridLeft().length*50, mouseX);
		int yPos = lc.mapY(0, lc.getGridLeft().length*50, mouseY);
		lc.setAttributeToGrid(1, xPos, yPos);
	}
}
