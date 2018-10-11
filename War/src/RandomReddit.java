import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author trossos This program opens 5 reddit/r/random pages
 */

public class RandomReddit {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("enter any character to open 5 random subreddits");
			String temp = in.next();
			if (!temp.equals("")) {
				for (int i = 0; i < 6; i++) {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("www.reddit.com/r/random"));
				}
				temp = "";
			}
		}
	}
}
