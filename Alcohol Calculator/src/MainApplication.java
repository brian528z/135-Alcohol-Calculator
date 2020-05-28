import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Timer;

import acm.graphics.GImage;
import acm.io.IODialog;

public class MainApplication extends GraphicsApplication implements ActionListener{
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	
//	private MenuPane menu;
//	private SettingsPane settings;
	
	private EnterInfoScreen enterinfo;
	private LoadingScreen loadingscreen;
	private EnterDrinkScreen drinkscreen;
	private SettingsScreen settingsscreen;
	
	public static User user;
	
	
	//Timer t;

	public void init() 
	{
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

//	public MenuPane getMenu() {
//		return menu;
//	}
	public void run() 
	{
		user = new User();
		
		setBackground(new Color(255,255,255));
		
		loadingscreen = new LoadingScreen(this);
		enterinfo = new EnterInfoScreen(this);
		drinkscreen = new EnterDrinkScreen(this);
		settingsscreen = new SettingsScreen(this);
		
		switchToLoading();
//		music = new SoundHub(this);
//		menu = new MenuPane(this);
//		
//		settings = new SettingsPane(this);
//		credits = new CreditsPane(this);
//		loading = new LoadingPane(this);
//		team = new CtrlzPane(this);
//		startGame = new PlayerSelectionPane(this);
//		console=new Console(this);
//		switchtoloading();
//		t = new Timer(10, this);
//		t.start();
//		fxToggle=true;
	}

	public void switchToLoading() {
		switchToScreen(loadingscreen);
	}
	
	public void switchToEnterInfo() {
		switchToScreen(enterinfo);
	}
	
	public void switchToEnterDrink() {
		switchToScreen(drinkscreen);
	}
	
	public void switchToSettings() {
		switchToScreen(settingsscreen);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		init();
	}
//	@Override 
//	public void keyPressed(KeyEvent e){
//		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
//			console.run();
//		}
//	}
	
}