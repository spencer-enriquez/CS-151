import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FrameLayout {
	public FrameLayout() {
		ArrayList<Category> cat = new ArrayList<Category>();
		cat.add(new Category("iPhone XS", 100));
		cat.add(new Category("Samsung S9", 100));
		cat.add(new Category("Google Pixel 3", 100));
		cat.add(new Category("Nokie 74", 100));
		cat.add(new Category("Flip Phone", 100));
		cat.add(new Category("Other", 100));

		JPanel textPanel = new JPanel();
		 textPanel.setLayout(new BorderLayout());
		 textPanel.add(new JLabel("Number Input"), BorderLayout.NORTH);
		 JPanel gridText = new JPanel(new GridBagLayout());
		 textPanel.add(gridText, BorderLayout.CENTER);
		 GridBagConstraints gbc = new GridBagConstraints();
		 gbc.insets = new Insets(5,5,5,5);
		 
		 for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 0;
			 gbc.gridy = i;
			 gridText.add(new JLabel(cat.get(i).getName()), gbc);
		 }
		 
		 for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 1;
			 gbc.gridy = i;
			 gridText.add(new JTextField("00"), gbc);
		 }
		 
		 JPanel graphPanel = new JPanel();
		 graphPanel.setLayout(new BorderLayout());
		 graphPanel.add(new JLabel("Graph Representation"), BorderLayout.NORTH);
		 JPanel gridGraph = new JPanel(new GridBagLayout());
		 graphPanel.add(gridGraph, BorderLayout.CENTER);
		 
		 for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 0;
			 gbc.gridy = i;
			 gridGraph.add(new JLabel(cat.get(i).getName()), gbc);
		 }
		 
		 for(int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 1;
			 gbc.gridy = i;
			 Bar b = new Bar(cat.get(i).getValue());
			 JLabel rect = new JLabel(b);
			 gridGraph.add(rect, gbc);
		 }
		 
		 
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(textPanel, BorderLayout.NORTH);
		 frame.add(graphPanel, BorderLayout.CENTER);
		 frame.pack();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);

}
	
	public static void main(String[] args)
	{
		FrameLayout me = new FrameLayout();
	}
 }
