package sortingAlgorithms;

import javax.swing.*;

public class VisualizeSorting {

	private JFrame windowFrame;
	private SortClass sortClass;

	public VisualizeSorting() {
		windowFrame = new JFrame("Visualize Sorting Algorithms");
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setSize(1280, 720);
		windowFrame.setVisible(true);

		sortClass = new SortClass();
		windowFrame.add(sortClass);
	}

	public static void main(String... args) {
		new VisualizeSorting();
		System.out.print("Thanks!");
	}
}
