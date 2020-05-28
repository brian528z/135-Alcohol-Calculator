import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class SettingsScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage edit;
	private GImage list;
	
	public SettingsScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0, 0);
		edit = new GImage("edit0.png", 300,200);
		list = new GImage("list0.png", 320, 400);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(edit);
		program.add(list);
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
		program.remove(edit);
		program.remove(list);
	}

	private GObject obj;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == edit) {
			program.switchToEnterInfo();
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == edit) {
			edit.setImage("edit1.png");
		}
		else if (obj == list) {
			list.setImage("list1.png");
		}
		else {
			edit.setImage("edit0.png");
			list.setImage("list0.png");
		}
	}
}