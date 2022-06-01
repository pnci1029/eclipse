package org.rocation.javatest.game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.sun.tools.javac.Main;

public class beatgame extends JFrame{

	// �̹��� ���۸��� ������۸��� ���� ����
	private Image screenImage;
	private Graphics screenGraphics;
	private Image introbackground;
	
	
	public beatgame() {
		setTitle("Beatgame");  // ���� ����� �̸� ����
		setSize(Main_beatgame.SCREEN_WIDTH, Main_beatgame.SCREEN_HEIGHT); // ������ �ʺ� �� ����
		setResizable(false); //  ȭ��ũ�� ���� X
		setLocationRelativeTo(null); // ����ȭ���� �߾ӿ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� ����� ���α׷��� ����� �ƴϸ� ��� ������
		setVisible(true); // ����â�� ȭ�鿡 ���̰� ���� - �⺻���� false�� Ʈ��� �����������
	
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
