package org.rocation.javatest.hp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class hpk01 extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image backgroundImage =
			new ImageIcon("src/images/5x5.jpg").getImage();
	private Image player = new ImageIcon("src/images/tubee.png").getImage();
	private Image coin = new ImageIcon("src/images/hhee.jpg").getImage();
	
	public hpk01() {
		setTitle("동전먹기게임");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent  e) {
				switch(e.getKeyCode() )  {
				case KeyEvent.VK_W:
					up  =  true;
					break;
				case  KeyEvent.VK_S:
					down  =  true;
					break;
				case  KeyEvent.VK_A:
					left  =  true;
					break;
				case  KeyEvent.VK_D:
					right  =  true;
					break;
				}
			}
			
			public void keyReleased(KeyEvent  e) {
				switch(e.getKeyCode() )  {
				case KeyEvent.VK_W:
					up  =  false;
					break;
				case  KeyEvent.VK_S:
					down  =  false;
					break;
				case  KeyEvent.VK_A:
					left  =  false;
					break;
				case  KeyEvent.VK_D:
					right  =  false;
					break;
				}
			}
	
		});
		init();
		while(true) {
			try {
				Thread.sleep(20);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			keyProcess();
			crashCheck();
		}
	}
	
	public void init() {
	score = 0;
	playerX = (500-playerWidth)/2;
	playerY = (500-playerHeight)/2;
	
	coinX = (int)(Math.random()*(500-playerWidth));
	coinY = (int)(Math.random()*(500-playerHeight-30))+30;  //30  더하고 빼는이유?
	
	}
	
	public void keyProcess() {
		if(up && playerY -3>30) playerY-=3;
		if(down && playerY + playerHeight +3<500) playerY+=3;
		if(left && playerX - 3>0) playerX-=3;
		if(right && playerX + playerWidth + 3<500) playerX+=3;
	}
	
	public void crashCheck() {
		if(playerX+playerWidth>coinX && coinX+coinWidth > playerX && playerY +playerHeight >coinY && coinY + coinHeight > playerY) {
		score+=100;
		coinX = (int)(Math.random()*(501-playerWidth));
		coinY = (int)(Math.random()*(501-playerHeight+30))-30;
		}
		
	}
	
public void paint(Graphics g) {
	bufferImage =  createImage(500,500);
	screenGraphic = bufferImage.getGraphics();
	screendraw(screenGraphic);
	g.drawImage(bufferImage,0, 0, null);
}
	
public void screendraw(Graphics g) {
	g.drawImage(backgroundImage, 0, 0, null);
	g.drawImage(coin, coinX, coinY, null);
	g.drawImage(player, playerX, playerY, null);
	g.setColor(Color.white);
	g.setFont(new Font("Ariel", Font.BOLD, 40));
	g.drawString("Score: " + score, 30, 80);
	this.repaint();
	
}

private int playerX, playerY;
private int playerWidth = player.getWidth(null);
private int playerHeight = player.getHeight(null);

private int coinX,  coinY;
private int coinWidth = coin.getWidth(null);
private int coinHeight = coin.getHeight(null);

private int score;

private boolean up,  down, left,  right;

	
	public static void main(String[] args) {
		new hpk01();
		
		
		
	}
}
