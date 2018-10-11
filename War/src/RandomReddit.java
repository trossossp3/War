import java.io.IOException;


/**
 * 
 * @author trossos
 * This program opens 5 reddit/r/random pages
 */

public class RandomReddit {

	public static void main(String[] args) throws IOException {

		for (int i = 0; i < 6; i++) {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create("www.reddit.com/r/random"));
		}
	}
}
