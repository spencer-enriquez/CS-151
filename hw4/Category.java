
import javax.swing.*;

public class Category {
	private String name;
	private int value;
	private JTextField input;
	
	public Category(String name, int value, JTextField area) {
		this.name = name;
		this.value = value;
		input = area;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public JTextField getTextField() {
		return input;
	}
}
