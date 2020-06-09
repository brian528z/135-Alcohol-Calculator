import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class SettingsScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage edit;
	private GImage list;
	
	private GImage list1;
	private GImage list2;
	
	public SettingsScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.PNG", 0, 0);
		edit = new GImage("edit0.png", 300,200);
		list = new GImage("list0.png", 320, 400);
		
		list1 = new GImage("alcohol1.PNG",0,0);
		list1.setSize(800, 600);
		list1.setVisible(false);
		
		list2 = new GImage("alcohol2.PNG", 0,0);
		list2.setSize(800,600);
		list2.setVisible(false);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(list1);
		program.add(list2);
		program.add(edit);
		program.add(list);
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
		program.remove(edit);
		program.remove(list);
		program.remove(list1);
		program.remove(list2);
	}

	private GObject obj;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == edit) {
			program.switchToEnterInfo();
		}
		else if (obj == list) {
			list1.sendToFront();
			list1.setVisible(true);
			
		}
		else if (list1.isVisible() == true && obj == list1) {
			list1.sendToBack();
			list1.setVisible(false);
			list2.sendToFront();
			list2.setVisible(true);
		}
		else if (list1.isVisible() == false && list2.isVisible() == true && obj == list2) {
			list2.sendToBack();
			list2.setVisible(false);
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