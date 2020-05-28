import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class SettingsScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage title;
	private GImage drinks;
	private EnterInfoScreen EnterInfoScreen;
	
	private GImage start;
	
	
	public SettingsScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0, 0);
		EnterInfoScreen = new EnterInfoScreen(app);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
	}

	private GObject obj;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
			program.switchToScreen(EnterInfoScreen);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
//		if (obj == start) {
//			start.setImage("start1.png");
//		}
//		else {
//			start.setImage("start0.png");
//		}
	}
}