import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import java.awt.TextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class EnterDrinkScreen extends GraphicsPane{
	private MainApplication program; 

	
	private GLabel title;
	
	
	private GImage beer;
	private GImage shot;
	private GImage wine;
	
	private GRect beerRect;
	private GRect shotRect;
	private GRect wineRect;
	private GRect customRect;
	
	private GRect beerLabelbox;
	private GRect shotLabelbox;
	private GRect wineLabelbox;
	private GRect customLabelbox;
	
	private GLabel beerLabel;
	private GLabel shotLabel;
	private GLabel wineLabel;
	private GLabel customLabel;
	
	private GLabel beerCount;
	private GLabel shotCount;
	private GLabel wineCount;
	private GLabel customCount;
	
	private GImage beerAdd;
	private GImage beerSub;
	private GImage wineAdd;
	private GImage wineSub;
	private GImage shotAdd;
	private GImage shotSub;
	private GImage customAdd;
	private GImage customSub;
	
	private GImage bg;
	
	private TextField weightInput;
	
	public EnterDrinkScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0,0);
		title = new GLabel("ENTER DRINKS", 275, 50);
		title.setFont(new Font("Arial", Font.BOLD, 35));
		title.setColor(new Color(255,255,255));
		
		beer = new GImage("beer.png", 80,75);
		wine = new GImage("wine.png", 290, 80);
		shot = new GImage("shot.png", 480, 75);
		
		beer.setSize(50,100);
		wine.setSize(50,90);
		shot.setSize(100,100);
		
		beerRect = new GRect(10,60,200,130);
		beerRect.setFillColor(new Color(230,249,255));
		beerRect.setColor(new Color(230,249,255));
		beerRect.setFilled(true);
		

		wineRect = new GRect(220,60,200,130);
		wineRect.setFillColor(new Color(230,249,255));
		wineRect.setColor(new Color(230,249,255));
		wineRect.setFilled(true);
		
		shotRect = new GRect(430,60,200,130);
		shotRect.setFillColor(new Color(230,249,255));
		shotRect.setColor(new Color(230,249,255));
		shotRect.setFilled(true);
		
		customRect = new GRect(640,60,150,130);
		customRect.setFillColor(new Color(230,249,255));
		customRect.setColor(new Color(230,249,255));
		customRect.setFilled(true);
		
		beerLabelbox = new GRect(10,200,200,100);
		beerLabelbox.setFillColor(new Color(230,249,255));
		beerLabelbox.setColor(new Color(230,249,255));
		beerLabelbox.setFilled(true);
		
		wineLabelbox = new GRect(220, 200 ,200,100);
		wineLabelbox.setFillColor(new Color(230,249,255));
		wineLabelbox.setColor(new Color(230,249,255));
		wineLabelbox.setFilled(true);

		shotLabelbox = new GRect(430,200,200,100);
		shotLabelbox.setFillColor(new Color(230,249,255));
		shotLabelbox.setColor(new Color(230,249,255));
		shotLabelbox.setFilled(true);
		
		customLabelbox = new GRect(640,200,150,100);
		customLabelbox.setFillColor(new Color(230,249,255));
		customLabelbox.setColor(new Color(230,249,255));
		customLabelbox.setFilled(true);
		
		beerLabel = new GLabel("BEER", 80, 230);
		beerLabel.setFont(new Font("Arial", Font.BOLD, 20));
		beerLabel.setColor(new Color(0,0,0));

		wineLabel = new GLabel("WINE", 290, 230);
		wineLabel.setFont(new Font("Arial", Font.BOLD, 20));
		wineLabel.setColor(new Color(0,0,0));
		
		shotLabel = new GLabel("SHOT", 500, 230);
		shotLabel.setFont(new Font("Arial", Font.BOLD, 20));
		shotLabel.setColor(new Color(0,0,0));
		
		customLabel = new GLabel("CUSTOM", 660, 230);
		customLabel.setFont(new Font("Arial", Font.BOLD, 20));
		customLabel.setColor(new Color(0,0,0));
		
		beerCount = new GLabel("0", 90, 280);
		beerCount.setFont(new Font("Arial", Font.BOLD, 40));
		beerCount.setColor(new Color(0,0,0));
		
		wineCount = new GLabel("0", 300, 280);
		wineCount.setFont(new Font("Arial", Font.BOLD, 40));
		wineCount.setColor(new Color(0,0,0));
		
		shotCount = new GLabel("0", 510, 280);
		shotCount.setFont(new Font("Arial", Font.BOLD, 40));
		shotCount.setColor(new Color(0,0,0));
		
		customCount = new GLabel("0", 680, 280);
		customCount.setFont(new Font("Arial", Font.BOLD, 40));
		customCount.setColor(new Color(0,0,0));
		
		beerAdd = new GImage("arrowUP.png", 160 , 200);
		beerSub = new GImage("arrowDOWN.png", 160, 250);
		
		wineAdd = new GImage("arrowUP.png", 370 , 200);
		wineSub = new GImage("arrowDOWN.png", 370, 250);

		shotAdd = new GImage("arrowUP.png", 580 , 200);
		shotSub = new GImage("arrowDOWN.png", 580, 250);
		
		customAdd = new GImage("arrowUP.png", 750 , 200);
		customSub = new GImage("arrowDOWN.png", 750, 250);

	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
		program.add(beerRect);
		program.add(wineRect);
		program.add(shotRect);
		program.add(customRect);
		program.add(beer);
		program.add(wine);
		program.add(shot);
		program.add(beerLabelbox);
		program.add(wineLabelbox);
		program.add(shotLabelbox);
		program.add(customLabelbox);
		program.add(beerLabel);
		program.add(wineLabel);
		program.add(shotLabel);
		program.add(customLabel);
		program.add(beerCount);
		program.add(wineCount);
		program.add(shotCount);
		program.add(customCount);
		program.add(beerAdd);
		program.add(beerSub);
		program.add(wineAdd);
		program.add(wineSub);
		program.add(shotAdd);
		program.add(shotSub);
		program.add(customAdd);
		program.add(customSub);
		
	}

	@Override
	public void hideContents() 
	{
		program.remove(bg);
		program.remove(title);
		program.remove(beer);
		program.remove(wine);
		program.remove(shot);
		program.remove(beerRect);
		program.remove(wineRect);
		program.remove(shotRect);
		program.remove(customRect);
		program.remove(beerLabelbox);
		program.remove(wineLabelbox);
		program.remove(shotLabelbox);
		program.remove(customLabelbox);
		program.remove(beerLabel);
		program.remove(wineLabel);
		program.remove(shotLabel);
		program.remove(customLabel);
		program.remove(beerCount);
		program.remove(wineCount);
		program.remove(shotCount);
		program.remove(customCount);
		program.remove(beerAdd);
		program.remove(beerSub);
		program.remove(wineAdd);
		program.remove(wineSub);
		program.remove(customAdd);
		program.remove(customSub);
	}

	private GObject obj;
	
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == beerAdd) {
			beerCount.setLabel(Integer.toString(Integer.parseInt(beerCount.getLabel()) + 1));
		}
		else if (obj == beerSub) {
			if (Integer.parseInt(beerCount.getLabel()) > 0) {
				beerCount.setLabel(Integer.toString(Integer.parseInt(beerCount.getLabel()) - 1));
			}
		}
		else if (obj == wineAdd) {
			wineCount.setLabel(Integer.toString(Integer.parseInt(wineCount.getLabel()) + 1));
		}
		else if (obj == wineSub) {
			if (Integer.parseInt(wineCount.getLabel()) > 0) {
				wineCount.setLabel(Integer.toString(Integer.parseInt(wineCount.getLabel()) - 1));
			}
		}
		else if (obj == shotAdd) {
			shotCount.setLabel(Integer.toString(Integer.parseInt(shotCount.getLabel()) + 1));
		}
		else if (obj == shotSub) {
			if (Integer.parseInt(shotCount.getLabel()) > 0) {
				shotCount.setLabel(Integer.toString(Integer.parseInt(shotCount.getLabel()) - 1));
			}
		}
		else if (obj == customAdd) {
			customCount.setLabel(Integer.toString(Integer.parseInt(customCount.getLabel()) + 1));
		}
		else if (obj == customSub) {
			if (Integer.parseInt(customCount.getLabel()) > 0) {
				customCount.setLabel(Integer.toString(Integer.parseInt(customCount.getLabel()) - 1));
			}
		}
		
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
//		obj = program.getElementAt(e.getX(), e.getY());
		
		
			
	}
}