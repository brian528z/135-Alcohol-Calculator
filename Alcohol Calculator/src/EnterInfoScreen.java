import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import java.awt.TextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;

public class EnterInfoScreen extends GraphicsPane{
	private MainApplication program; 

	
	private GLabel title;
	private GImage male;
	private GImage female;
	private GLabel weight;
	private GImage next;
	
	private GImage bg;
	
	private TextField weightInput;
	
	public EnterInfoScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0,0);
		title = new GLabel("ENTER INFORMATION", 225, 50);
		male = new GImage("male0.png", 125, 150);
		female = new GImage("female0.png", 475, 150);
		weight = new GLabel("WEIGHT : ", 150, 350);
		next = new GImage("next00.png", 325, 450);
		
		Font mf = new Font("Arial", Font.BOLD, 20);
		
		title.setFont(new Font("Arial", Font.BOLD, 35));
		title.setColor(new Color(255,255,255));
		weight.setFont(new Font("Arial", Font.BOLD, 35));
		weight.setColor(new Color(255,255,255));
		
		
		
		weightInput = new TextField();
		weightInput.setLocation(500,325);
		weightInput.setSize(100,50);
		weightInput.setFont(new Font("Arial", Font.BOLD, 40));
		
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
		program.add(male);
		program.add(female);
		program.add(weight);
		program.add(weightInput);
		program.add(next);
	}

	@Override
	public void hideContents() 
	{
		program.remove(title);
		program.remove(male);
		program.remove(female);
		program.remove(weight);
		program.remove(weightInput);
		program.remove(next);
	}

	private GObject obj;
	
	private boolean selected = false;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if(obj == next)
		{
			MainApplication.user.setWeight(Integer.parseInt(weightInput.getText()));
		}
		else if (obj == male) {
			selected = true;
			MainApplication.user.setSex("male");
		}
		else if (obj == female) {
			selected = true;
			MainApplication.user.setSex("female");
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (selected == false) {
			if(obj == male) {
				male.setImage("male1.png");
			}
			else if (obj == female) {
				female.setImage("female1.png");
			}
			else {
				male.setImage("male0.png");
				female.setImage("female0.png");
			}
		}
		else if (weightInput.getText().length() > 1) {
			if (obj == next) {
				next.setImage("next1.png");
			}
			else {
				next.setImage("next0.png");
			}
		}
			
	}
}