package sortingAlgorithms;

import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;


public class SortClass extends JPanel {
	public static final int WIN_WIDTH = 1280 ;
	public static final int WIN_HEIGHT = 600 ;
	private static final int BAR_WIDTH = 10;
	private static final int NUM_BARS = WIN_WIDTH / BAR_WIDTH;
	private int[] array;

	public SortClass(){
		array = new int[NUM_BARS];
		for (int i = 0; i < NUM_BARS; i++) {
			array[i] = i;
		}
		shuffleArray();
		repaint();
		Timer timer = new Timer(10000, null);
		timer.setInitialDelay(10000);
		timer.start(); 

			
		setBackground(Color.white);
		
		new BubbleSort().runSort(array);
		repaint();
	
	}
	
	
	private void shuffleArray() {
		Random rngRandom = new Random();
		for (int i = 0; i < NUM_BARS; i++) {
			int swappingIndex = rngRandom.nextInt(NUM_BARS-1);
			int temp = array[i];
			array[i] = array[swappingIndex];
			array[swappingIndex] = temp;			
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D graphics2d = (Graphics2D) g;
		super.paintComponent(graphics2d);

		graphics2d.setColor(Color.GRAY);
		for (int x = 1; x < NUM_BARS-1; x++) {
			graphics2d.fillRect(BAR_WIDTH * x, WIN_HEIGHT-2*array[x], BAR_WIDTH, 2*array[x]);
		}
		
		graphics2d.setColor(Color.red);
		graphics2d.drawRect(10, 10, WIN_WIDTH-20, WIN_HEIGHT-10);		
	}
	
	
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIN_WIDTH, WIN_HEIGHT);
    }

}
