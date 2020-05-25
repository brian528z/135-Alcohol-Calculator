import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import java.awt.TextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;

public class EnterInfoScreen extends GraphicsPane{
	private MainApplication program; 

	//private GImage easy;
	
	private GLabel title;
	private GImage male;
	private GImage female;
	private GLabel weight;
	private GImage next;
	
	
	private TextField weightInput;
	
	public EnterInfoScreen(MainApplication app) {
		super();
		program = app;
		
		title = new GLabel("Enter Information", 250, 50);
		male = new GImage("male0.png", 100, 150);
		female = new GImage("female0.png", 450, 150);
		weight = new GLabel("Weight: ", 150, 350);
		next = new GImage("next0.png", 275, 450);
		
		Font mf = new Font("Arial", Font.BOLD, 20);
		
		title.setFont(new Font("Arial", Font.BOLD, 35));
		weight.setFont(mf);
		
		
		weightInput = new TextField();
		weightInput.setLocation(500,325);
		weightInput.setSize(100,50);
		weightInput.setFont(new Font("Arial", Font.BOLD, 40));
		
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
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if(obj == next)
		{
		}
//		else if(obj == easy)
//		{
//			program.switchToDraft(true , 1);
//		}
//		else if(obj == medium)
//		{
//			program.switchToDraft(true , 2);
//		}
//		else if(obj == hard)
//		{
//			program.switchToDraft(true , 3);
//		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
		if(obj == male) {
			male.setImage("male1.png");
		}
		else if (obj == female) {
			female.setImage("female1.png");
		}
		else if (obj == next) {
			next.setImage("next1.png");
		}
		else {
			next.setImage("next0.png");
			male.setImage("male0.png");
			female.setImage("female0.png");
			
		}
	}
}