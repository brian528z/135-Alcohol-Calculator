import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
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
	
	private GRect beerLabelbox;
	private GRect shotLabelbox;
	private GRect wineLabelbox;
	
	private GLabel beerLabel;
	private GLabel shotLabel;
	private GLabel wineLabel;
	
	private GLabel beerCount;
	private GLabel shotCount;
	private GLabel wineCount;
	
	private GImage beerAdd;
	private GImage beerSub;
	private GImage wineAdd;
	private GImage wineSub;
	private GImage shotAdd;
	private GImage shotSub;
	
	private GLabel drinkingTimeLabel;
	private GLabel drinkingTime;
	private GLabel hr;
	private GImage timeAdd;
	private GImage timeSub;
	
	private GLabel totalCaloriesLabel;
	private GLabel bacLabel;
	private GLabel breakdownLabel;
	
	private GLabel totalCalories;
	private GLabel bac;
	private GLabel breakdown;
	
	private GRect caloriesBox;
	private GRect bacBox;
	private GRect breakdownBox;
	
	private GImage settings;
	
	private SettingsScreen settingsScreen;
	
	private GImage bg;
	
	private TextField weightInput;
	
	private double a;
	private int w;
	private double r;
	private double h;
	
	public EnterDrinkScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.PNG", 0,0);
		title = new GLabel("ENTER DRINKS", 275, 50);
		title.setFont(new Font("Arial", Font.BOLD, 35));
		title.setColor(new Color(255,255,255));
		
		beer = new GImage("beer.png", 110,75);
		wine = new GImage("wine.png", 380, 80);
		shot = new GImage("shot.png", 610, 75);
		
		beer.setSize(50,100);
		wine.setSize(50,90);
		shot.setSize(100,100);
		
		beerRect = new GRect(10,60,250,130);
		beerRect.setFillColor(new Color(230,249,255));
		beerRect.setColor(new Color(230,249,255));
		beerRect.setFilled(true);
		

		wineRect = new GRect(270,60,250,130);
		wineRect.setFillColor(new Color(230,249,255));
		wineRect.setColor(new Color(230,249,255));
		wineRect.setFilled(true);
		
		shotRect = new GRect(530,60,250,130);
		shotRect.setFillColor(new Color(230,249,255));
		shotRect.setColor(new Color(230,249,255));
		shotRect.setFilled(true);
		
		
		beerLabelbox = new GRect(10,200,250,100);
		beerLabelbox.setFillColor(new Color(230,249,255));
		beerLabelbox.setColor(new Color(230,249,255));
		beerLabelbox.setFilled(true);
		
		wineLabelbox = new GRect(270, 200 ,250,100);
		wineLabelbox.setFillColor(new Color(230,249,255));
		wineLabelbox.setColor(new Color(230,249,255));
		wineLabelbox.setFilled(true);

		shotLabelbox = new GRect(530,200,250,100);
		shotLabelbox.setFillColor(new Color(230,249,255));
		shotLabelbox.setColor(new Color(230,249,255));
		shotLabelbox.setFilled(true);
		
		
		beerLabel = new GLabel("12oz  4.5%  BEER", 30, 230);
		beerLabel.setFont(new Font("Arial", Font.BOLD, 20));
		beerLabel.setColor(new Color(0,0,0));

		wineLabel = new GLabel("6oz  12%   WINE", 290, 230);
		wineLabel.setFont(new Font("Arial", Font.BOLD, 20));
		wineLabel.setColor(new Color(0,0,0));
		
		shotLabel = new GLabel("1oz  40%   SHOT", 550, 230);
		shotLabel.setFont(new Font("Arial", Font.BOLD, 20));
		shotLabel.setColor(new Color(0,0,0));
		
		
		beerCount = new GLabel("0", 140, 280);
		beerCount.setFont(new Font("Arial", Font.BOLD, 40));
		beerCount.setColor(new Color(0,0,0));
		
		wineCount = new GLabel("0", 400, 280);
		wineCount.setFont(new Font("Arial", Font.BOLD, 40));
		wineCount.setColor(new Color(0,0,0));
		
		shotCount = new GLabel("0", 660, 280);
		shotCount.setFont(new Font("Arial", Font.BOLD, 40));
		shotCount.setColor(new Color(0,0,0));
		
		
		beerAdd = new GImage("arrowUP.png", 210 , 200);
		beerSub = new GImage("arrowDOWN.png", 210, 250);
		
		wineAdd = new GImage("arrowUP.png", 470 , 200);
		wineSub = new GImage("arrowDOWN.png", 470, 250);

		shotAdd = new GImage("arrowUP.png", 730 , 200);
		shotSub = new GImage("arrowDOWN.png", 730, 250);
		
		
		drinkingTimeLabel = new GLabel("DRINKING TIME :", 160, 350);
		drinkingTimeLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		drinkingTime = new GLabel("0.0", 510, 350);
		drinkingTime.setFont(new Font("Arial", Font.BOLD, 35));
		
		hr = new GLabel("Hr", 575, 350);
		hr.setFont(new Font("Arial", Font.BOLD, 35));
		
		timeSub = new GImage("minus.png", 460, 315);
		timeAdd = new GImage("plus.png", 630, 315);
		
		totalCaloriesLabel = new GLabel("TOTAL CALORIES CONSUMED : ", 30, 540);
		totalCaloriesLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		bacLabel = new GLabel("BLOOD ALCOHOL CONTENT    : ", 30, 420);
		bacLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		breakdownLabel = new GLabel("AVG TIME FOR BREAKDOWN   :", 30, 480);
		breakdownLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		caloriesBox = new GRect(20,500,540,50);
		caloriesBox.setFillColor(new Color(230,249,255));
		caloriesBox.setColor(new Color(230,249,255));
		caloriesBox.setFilled(true);
		
		bacBox = new GRect(20,380,540,50);
		bacBox.setFillColor(new Color(230,249,255));
		bacBox.setColor(new Color(230,249,255));
		bacBox.setFilled(true);
		
		breakdownBox = new GRect(20,440,540,50);
		breakdownBox.setFillColor(new Color(230,249,255));
		breakdownBox.setColor(new Color(230,249,255));
		breakdownBox.setFilled(true);
		
		settings = new GImage("settings0.png", 650,5);
		settings.setSize(120,50);
		
		settingsScreen = new SettingsScreen(app);
		
		
		totalCalories = new GLabel("0 kcal", 600, 540);
		bac = new GLabel("0.00", 600, 420);
		breakdown = new GLabel("0HR 00MIN", 600, 480);
		
		totalCalories.setFont(new Font("Arial", Font.BOLD, 35));
		bac.setFont(new Font("Arial", Font.BOLD, 35));
		breakdown.setFont(new Font("Arial", Font.BOLD, 35));
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
		program.add(beerRect);
		program.add(wineRect);
		program.add(shotRect);
		program.add(beer);
		program.add(wine);
		program.add(shot);
		program.add(beerLabelbox);
		program.add(wineLabelbox);
		program.add(shotLabelbox);
		program.add(beerLabel);
		program.add(wineLabel);
		program.add(shotLabel);
		program.add(beerCount);
		program.add(wineCount);
		program.add(shotCount);
		program.add(beerAdd);
		program.add(beerSub);
		program.add(wineAdd);
		program.add(wineSub);
		program.add(shotAdd);
		program.add(shotSub);
		program.add(drinkingTimeLabel);
		program.add(drinkingTime);
		program.add(timeAdd);
		program.add(timeSub);
		program.add(hr);
		
		program.add(caloriesBox);
		program.add(bacBox);
		program.add(breakdownBox);
		
		program.add(totalCaloriesLabel);
		program.add(bacLabel);
		program.add(breakdownLabel);
		program.add(settings);
		program.add(totalCalories);
		program.add(bac);
		program.add(breakdown);
		
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
		program.remove(beerLabelbox);
		program.remove(wineLabelbox);
		program.remove(shotLabelbox);
		program.remove(beerLabel);
		program.remove(wineLabel);
		program.remove(shotLabel);
		program.remove(beerCount);
		program.remove(wineCount);
		program.remove(shotCount);
		program.remove(beerAdd);
		program.remove(beerSub);
		program.remove(wineAdd);
		program.remove(wineSub);
		program.remove(drinkingTimeLabel);
		program.remove(drinkingTime);
		program.remove(timeAdd);
		program.remove(timeSub);
		program.remove(hr);
		program.remove(totalCaloriesLabel);
		program.remove(bacLabel);
		program.remove(breakdownLabel);
		program.remove(caloriesBox);
		program.remove(bacBox);
		program.remove(breakdownBox);
		program.remove(settings);
		program.remove(totalCalories);
		program.remove(bac);
		program.remove(breakdown);
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
		
		else if (obj == timeAdd) {
			drinkingTime.setLabel(Double.toString(Double.parseDouble(drinkingTime.getLabel()) + 0.5));
		}
		else if (obj == timeSub) {
			if (Double.parseDouble(drinkingTime.getLabel()) > 0.0) {
				drinkingTime.setLabel(Double.toString(Double.parseDouble(drinkingTime.getLabel()) - 0.5));
			}
		}
		
		else if (obj == settings) {
			program.switchToScreen(settingsScreen);
		}
		
		
		a = Integer.parseInt(beerCount.getLabel())*12*0.05 + Integer.parseInt(wineCount.getLabel())*6*0.12 + Integer.parseInt(shotCount.getLabel())*1*0.4;
		w = MainApplication.user.getWeight();
		if(MainApplication.user.getSex() == "male") {
			r = 0.73;
		}
		else {
			r = 0.66;
		}
		h = Double.parseDouble(drinkingTime.getLabel());
		
		
		if ((a*5.14)/(w*r) - (0.015*h) < 0) {
			bac.setLabel(Double.toString(0.00));
		}
		else {
			bac.setLabel(String.format("%.2f", ((a*5.14)/(w*r) - (0.015*h)) ) );
		}
		
		
		double decPart = Double.parseDouble(bac.getLabel())/0.015 - (int) (Double.parseDouble(bac.getLabel())/0.015) ;
		
		
		breakdown.setLabel(Integer.toString((int) (Double.parseDouble(bac.getLabel())/0.015)) + "HR" +  (int) (decPart*60) +"MIN" );
		
		
		int total = Integer.parseInt(beerCount.getLabel())*150 + Integer.parseInt(wineCount.getLabel())*140 + Integer.parseInt(shotCount.getLabel())*100;
		totalCalories.setLabel(Integer.toString(total) + " kcal");
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		obj = program.getElementAt(e.getX(), e.getY());
		
		if (obj == settings) {
			settings.setImage("settings1.png");
			settings.setSize(120,50);
		}
		else {
			settings.setImage("settings0.png");
			settings.setSize(120,50);
		}
		
		
			
	}
}