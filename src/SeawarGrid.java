import processing.core.PApplet;

public class SeawarGrid
{
	private PApplet globalPApplet;
	
	public SeawarGrid(PApplet pPApplet)
	{
		globalPApplet = pPApplet;
	}
	
	public void displayGrid(int pXCoord, int pYCoord, int pSize, int[][] pGrid)
	{
		for (int i = 0; i < pGrid.length; i++)
		{
			for (int j = 0; j < pGrid.length; j++)
			{
				globalPApplet.fill(255);
				globalPApplet.rect(pXCoord + i * pSize, pYCoord+ j * pSize, pSize, pSize);
				switch(pGrid[i][j])
				{
				case 0:
					globalPApplet.fill(255);
					globalPApplet.rect(pXCoord + i * pSize, pYCoord+ j * pSize, pSize, pSize);
					break;
					
				case 1:
					globalPApplet.fill(125);
					globalPApplet.rect(pXCoord + i * pSize, pYCoord+ j * pSize, pSize, pSize);
					break;
					
				case 2:
					globalPApplet.fill(0,0,255);
					globalPApplet.rect(pXCoord + i * pSize, pYCoord+ j * pSize, pSize, pSize);
					break;
					
				case 3:
					globalPApplet.fill(0);
					globalPApplet.rect(pXCoord + i * pSize, pYCoord+ j * pSize, pSize, pSize);
					break;
					
				default:
					break;
				}
			}
		}
	}
	
	public void displayLabels(int pXCoord, int pYCoord, int pGridLength)
	{
		char labelLetter = 'A';
		for (int i = 1; i < pGridLength + 1; i++)
		{
			globalPApplet.fill(255);
			globalPApplet.text(i, pXCoord, i * pYCoord +35);
			globalPApplet.text(labelLetter, 25 + pXCoord + i * 50, pYCoord - 10);
			labelLetter++;
		}
	}
	
}
