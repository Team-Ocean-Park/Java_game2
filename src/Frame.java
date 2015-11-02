import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String title="Tower Game ver 1.0";
	public static Dimension size= new Dimension(650,550);
	//private JPanel contentPane;
	/**
	 * Launch the application.
	 */	
	public  void init(){
		setLayout(new GridLayout(1, 1 , 0 ,0));
		Screen screen =new Screen();
		add(screen);
		setVisible(true);
	}
	

	/**
	 * Create the frame.
	 */
	public Frame() {
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		init();
		
	}
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		
		Frame frame = new Frame();

}

}
