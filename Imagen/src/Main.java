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
        
    
    }
}

