/*
 * Precrtati sliku ispod koristeci Graphics metode koje smo radili i podlogu koju sam vam napravio.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GuiProgramming {


	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		// **** Draw here ****
		g.setColor(Color.BLACK);
		g.drawRect(50, 50, 1000, 600);
		g.drawRect(100, 100, 300, 500);
		g.drawRect(500, 100, 300, 500);
		g.drawRect(900, 100, 100, 500);
		
		g.setColor(Color.BLUE);
		g.drawString("java", 70, 70);
		g.drawString("lang", 110, 120);
		g.drawString("avt", 510, 120);
		g.drawString("util", 910, 120);
		
		g.setColor(Color.BLACK);
		g.drawRect(130, 140, 250, 200);
		g.drawRect(530, 140, 250, 200);
		
		g.drawRect(165, 180, 200, 50);
		g.drawRect(565, 180, 200, 50);
		
		g.drawRect(165, 250, 200, 50);
		g.drawRect(565, 250, 200, 50);
		
		g.drawRect(165, 400, 200, 50);
		g.drawRect(565, 400, 200, 50);
		
		g.drawRect(165, 500, 200, 50);
		g.drawRect(565, 500, 200, 50);
		
		g.setColor(Color.GREEN);
		g.drawString("Math", 140, 160);
		g.drawString("Graphic", 540, 160);
		
		g.setColor(Color.RED);
		g.drawString("Sqrt()", 190, 200);
		g.drawString("random()", 190, 270);
		
		g.drawString("drawRect()", 590, 200);
		g.drawString("setColor()", 590, 270);
		
		g.setColor(Color.GREEN);
		g.drawString("String", 180, 430);
		g.drawString("Integer", 180, 530);
		
		g.drawString("Color", 580, 430);
		g.drawString("Font", 580, 530);
		
		// *******************
		w.setImage(img);
	}

}
