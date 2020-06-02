import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class LoadingScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage title;
	private GImage drinks;
	private EnterInfoScreen EnterInfoScreen;
	
	private GImage start;
	
	
	public LoadingScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.PNG", 0, 0);
		drinks = new GImage("title_image.png", 300, 250);
		title = new GImage("title3.png", 100, 20);
		start = new GImage("start0.png", 285, 470);
		EnterInfoScreen = new EnterInfoScreen(app);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
		program.add(start);
		program.add(drinks);
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
		program.remove(title);
		program.remove(start);
		program.remove(drinks);
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