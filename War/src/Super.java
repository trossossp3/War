import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Super extends JPanel{
	
	
	 public void paint(Graphics g) {
		 
		
		    Graphics2D g2d = (Graphics2D) g;
		    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		    
		    AttributedString as1 = new AttributedString(2+"superduper");
		    as1.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER, 1, 12);
		   // as1.addAttribute(TextAttribute.FOREGROUND, Color.RED, 2, 6);
		    as1.addAttribute(TextAttribute.SIZE, 300);
		   // let myAttribute = [ NSFontAttributeName: UIFont(name: "Chalkduster", size: 18.0)! ]
		    g2d.drawString(as1.getIterator(), 15, 600);
		  }
	
	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Text attributes");
	    frame.add(new Super());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	    frame.setSize(1000, 1000);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	   
	}
	

}
