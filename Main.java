package task_9;
/**
 * Assignment task 9: Guessing Game
 * Author: Aadil Imran, 2022
 */

import static java.lang.System.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String txtfile = "data/data.txt";//path to text file with country info/data.
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
			
		} catch (IOException ioe) {
			out.printf("Perhaps missing text file: %s  %s? \n\n", new Main().getClass().getPackage().getName(), txtfile);
		}
	}
}

