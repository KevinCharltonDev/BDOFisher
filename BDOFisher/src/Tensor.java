import java.awt.Color;
import java.awt.Point;


public class Tensor {
	private Point coords;
	private Color color;
	private Color prevColor;
	private double brightness = 0;
	private double gradient = 0;
	
	public Tensor(int x, int y){
		coords = new Point(x, y);
		color = new Color(0, 0, 0);
		prevColor = new Color(0, 0, 0);
	}
	
	public void updateColors(Color col){
		prevColor = color;
		color = col;
		brightness = (col.getRed()+col.getBlue()+col.getGreen())/768;
	}

	public void updateGradient(double g){
		gradient = g;
	}
}
