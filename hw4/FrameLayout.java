import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ChangeEvent;

public class FrameLayout {
	private ArrayList<Category> cat = new ArrayList<Category>();
	GridBagConstraints gbc = new GridBagConstraints();
	JPanel textPanel;
	JPanel graphPanel;
	
	
	public FrameLayout() {
		gbc.insets = new Insets(5,5,5,5);

		cat.add(new Category("iPhone XS", 100, new JTextField(5)));
		cat.add(new Category("Samsung S9", 100,  new JTextField(5)));
		cat.add(new Category("Google Pixel 3", 100,  new JTextField(5)));
		cat.add(new Category("Nokie 74", 100,  new JTextField(5)));
		cat.add(new Category("Flip Phone", 100,  new JTextField(5)));
		cat.add(new Category("Other", 100,  new JTextField(5)));

		JPanel textPanel = new JPanel();
		 textPanel.setLayout(new BorderLayout());
		 textPanel.add(new JLabel("Number Input"), BorderLayout.NORTH);
		 JPanel gridText = new JPanel(new GridBagLayout());
		 textPanel.add(gridText, BorderLayout.CENTER);		 
		 for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 0;
			 gbc.gridy = i;
			 gridText.add(new JLabel(cat.get(i).getName()), gbc);
		 }
		 
		 for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 1;
			 gbc.gridy = i;
			 gridText.add(cat.get(i).getTextField(), gbc);
		 }
		 JButton changes = new JButton("Apply Changes");
		 textPanel.add(changes, BorderLayout.SOUTH);
				 
		 
		 JPanel graphPanel = new JPanel();
		 graphPanel.setLayout(new BorderLayout());
		 graphPanel.add(new JLabel("Graph Representation"), BorderLayout.NORTH);
		 JPanel gridGraph = paintGraph();									// makes and paints graph
		 graphPanel.add(gridGraph, BorderLayout.CENTER);
		 
		 
		 
		 
		 changes.addActionListener(event ->
		 {
			 for (int i = 0; i < cat.size(); i++) {
				String text = cat.get(i).getTextField().getText();
				if (!text.equals(""))
					cat.get(i).setValue(Integer.parseInt(text));
			 }
			 graphPanel.updateUI();
		 });
		 
		 
		 
		 
		 
		 JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(textPanel, BorderLayout.NORTH);
		 frame.add(graphPanel, BorderLayout.CENTER);
		 frame.pack();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);

}
	
	public JPanel paintGraph() {
		JPanel panel = new JPanel(new GridBagLayout());
		for (int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 0;
			 gbc.gridy = i;
			 gbc.anchor = gbc.LINE_START;
			 panel.add(new JLabel(cat.get(i).getName()), gbc);
		 }
		
		for(int i = 0; i < cat.size(); i++) {
			 gbc.gridx = 1;
			 gbc.gridy = i;
			 Bar b = new Bar(cat.get(i).getValue());
			 JLabel rect = new JLabel(b);
			 panel.add(rect, gbc);
		 }
		return panel;
	}
/*	
	public void changeGraph() {
		JPanel graph = paintGraph();									// makes and paints graph
		graphPanel.add(graph, BorderLayout.CENTER);
		ChangeEvent event = new ChangeEvent(this);
	}
*/
	public static void main(String[] args)
	{
		FrameLayout me = new FrameLayout();
	}
 }
