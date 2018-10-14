import java.awt.*;

import javax.swing.Icon;

public class Bar implements Icon{
	private int width;
	
	public Bar(int width) {
		this.width = width;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D shape = (Graphics2D) g;
		Rectangle.Double rect = new Rectangle.Double(x, y, width, width);
		shape.setColor(Color.BLACK);
		shape.fill(rect);
		shape.draw(rect);
	}

	public int getIconWidth() {
		return width;
	}

	public int getIconHeight() {
		return 10;
	}
	
}
