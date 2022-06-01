package org.rocation.javatest.game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sun.tools.javac.Main;

public class beatgame extends JFrame{

	// 이미지 버퍼링시 더블버퍼링을 위한 세팅
	private Image screenImage;
	private Graphics screenGraphics;
	private Image introbackground;
	
	
	public beatgame() {
		setTitle("Beatgame");  // 게임 실행시 이름 설정
		setSize(Main_beatgame.SCREEN_WIDTH, Main_beatgame.SCREEN_HEIGHT); // 사이즈 너비 폭 설정
		setResizable(false); //  화면크기 변경 X
		setLocationRelativeTo(null); // 게임화면이 중앙에서 나옴
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임 종료시 프로그램도 종료됨 아니면 계속 가동중
		setVisible(true); // 게임창이 화면에 보이게 해줌 - 기본값이 false라 트루로 설정해줘야함
	
		introbackground = new ImageIcon(Main.class.getClassLoader().getResource("./images/background.jpg")).getImage();;
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main_beatgame.SCREEN_WIDTH, Main_beatgame.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(introbackground, 0, 0, null);
		this.repaint();
	}

}
