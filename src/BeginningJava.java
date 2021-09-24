

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class BeginningJava {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.add(new CustomPaintComponent());
		int frameWidth = 600;
		int frameHeight = 600;
		frame.setSize(frameWidth, frameHeight);
		frame.setVisible(true);
	}
	static class CustomPaintComponent extends Component {
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D)g;
			class perc {
				public int w(int x) {
					int wide = getSize().width;
					return 0;
				}
			}
			int x = 0;
			int y = 0;
			int w = getSize().width-1;
			int h = getSize().height-1;
			g2d.fillOval(525,y,w/10,w/10);
		}
	}
}
