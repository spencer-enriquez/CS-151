import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.*;

public class ColorFrame implements Icon{
	private int width;
	private Color color;
	
	public ColorFrame(int width) {
		this.width = width;
		this.color = Color.red;
	}
	
	public ColorFrame(int width, Color c) {
		this.width = width;
		this.color = c;
	}
	
	
	public int getIconWidth() {
		return width;
	}

	public int getIconHeight() {
		return width;
	}
	
	public void changeColor (Color c) {
		color = c;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D shape = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
		shape.setColor(color);
		shape.fill(circle);
		shape.draw(circle);
	}
	
	public void repaint(Color c) {
		this.color = c;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Color Changing Buttons");
		ColorFrame circle = new ColorFrame(200);
		JLabel label = new JLabel(circle);
		frame.add(label);
		
		
		JButton redButton = new JButton("Red");
		redButton.addActionListener(event -> 
		{
			circle.changeColor(Color.red);
			label.repaint();
		});
		JButton greenButton = new JButton("Green");
		greenButton.addActionListener(event -> 
		{
			circle.changeColor(Color.green);
			label.repaint();
		});
		JButton blueButton = new JButton("Blue");
		blueButton.addActionListener(event -> 
		{
			circle.changeColor(Color.blue);
			label.repaint();
		});
		frame.setLayout(new FlowLayout());
		frame.add(redButton);
		frame.add(greenButton);
		frame.add(blueButton);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
