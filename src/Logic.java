import processing.core.PApplet;

public class Logic 
{
	private boolean isPlayerOne = true;
	private int turnCounter = 0;
	private int[][] gridLeft = new int[10][10];
	private int[][] gridRight = new int[10][10];
	
	public int mapX(int pStart, int pStop, int pXMouse)
	{
		return (int) PApplet.map(pXMouse-75, pStart, pStop, 0, 10);
	}
	
	public int mapY(int pStart, int pStop, int pYMouse)
	{
		return (int) PApplet.map(pYMouse-50, pStart, pStop, 0, 10);
	}
	
	public int[][] getGridLeft()
	{
		return gridLeft;
	}
	public int[][] getGridRight()
	{
		return gridRight;
	}
	
	/**
	 * 0 = nix
	 * 1 = hit
	 * 2 = wasser
	 * 3 = ship (nicht getroffen)
	 * @param pAttribute
	 */
	public void setAttributeToGrid(int pAttribute, int XPos, int YPos)
	{
		if (isPlayerOne)
			gridLeft[XPos][YPos] = pAttribute;
		else
			gridRight[XPos][YPos] = pAttribute;
	}
}
