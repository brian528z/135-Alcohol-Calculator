import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class LoadingScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage title;
	private EnterInfoScreen EnterInfoScreen;
	
	private GImage start;
	
	
	public LoadingScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0, 0);
		title = new GImage("title.png", 100, 100);
		start = new GImage("start0.png", 285, 470);
		EnterInfoScreen = new EnterInfoScreen(app);
		
//		dif = new GImage("TitleImage/TITLE_DIFFICULTY.png", 50, 25);
//		dif.setSize(500, 50);
//	
//		X = new GButton("X",750, 0, 50, 50);
//		X.setFillColor(Color.RED);
//		
//		easy = new GImage("Button/EASY0.png", 50, 150);
//		medium = new GImage("Button/MEDIUM0.png",300, 150);
//		hard = new GImage("Button/HARD0.png", 550, 150);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
		program.add(start);
//		program.add(X);
//		program.add(easy);
//		program.add(medium);
//		program.add(hard);
//		program.add(dif);
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
		program.remove(title);
		program.remove(start);
//		program.remove(X);
//		program.remove(easy);
//		program.remove(medium);
//		program.remove(hard);
//		program.remove(dif);
	}

	private GObject obj;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if(obj == start) {
			program.switchToScreen(EnterInfoScreen);
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == start) {
			start.setImage("start1.png");
		}
		else {
			start.setImage("start0.png");
		}
	}
}