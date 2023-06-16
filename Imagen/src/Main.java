import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main name = new Main();
		name.setVisible(true);
	}
	public Main() {
		this.setVisible(true);
		this.setSize(1024, 576);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pintar = new JPanel();
		pintar.setBounds(0, 0, getWidth(), getHeight());
		pintar.setBackground(new Color(220,235,216));
		this.add(pintar);
		
		
		this.repaint();
		this.revalidate();
		}


	public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(new Color(137,137,137));
        int [] bx = {810,785,800,784,798,832,838,870,872,915,909,955,945,984,972,1000,986,1001,987,986};
        int [] by = {32,60,60,105,100,175,162,192,176,190,176,174,164,144,136,105,102,61,63,20};
        g.fillPolygon(bx, by, 20);
        int [] cx = {237,252,244,260,260,273,279,289,299,305,318,318,333,327,342};
        int [] cy = {575,569,556,556,542,548,534,545,532,548,541,556,555,570,575};
        g.fillPolygon(cx, cy, 15);
        
        g.setColor(new Color(128,128,128));
        g.fillOval(815, 0, 150, 150);
        g.fillOval(256, 550, 70, 70);
        
        
        
        g.setColor(Color.BLACK);
        g.fill3DRect(0, 100, 306, 67, true);
        g.fill3DRect(271, 165, 35, 68, true);
        g.fill3DRect(271, 365, 35, 140, true);
        g.fill3DRect(0, 435, 140, 145, true);
        g.fill3DRect(440, 366, 600, 210, true);
        g.fill3DRect(741, 0, 300, 63, true);
        
        
        g.setColor(new Color(98,85,80));
        g.fill3DRect(0, 102, 304, 64, true);
        g.fill3DRect(273, 436, 32, 68, true);
        g.fill3DRect(0, 437, 138, 145, true);
        g.fill3DRect(442, 369, 600, 210, true);
        g.fill3DRect(743, 0, 300, 61, true);
        
        g.setColor(new Color(140,133,122));
        g.fill3DRect(0, 102, 38, 35, isActive());
        int [] ax = {472,472,495,495,550,550,575,575};
        int [] ay = {500,545,545,565,565,550,550,500};
        g.fillPolygon(ax, ay, 8);
        
        
        g.setColor(new Color(139,98,80));
        g.fill3DRect(273, 168, 32, 63, isActive());
        g.fill3DRect(273, 368, 32, 65, true);
        
        g.setColor(Color.RED);
        
        
        
        
        
        
        
        
    }
}

