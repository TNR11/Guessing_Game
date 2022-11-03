package task_9;

import static java.lang.System.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.nio.file.*;

public class GameApp {
	Scanner input = new Scanner(in);
	private List<Country> countryList;
	
	public GameApp(String txtfile) throws IOException {
		countryList = new LinkedList<>();
		readData(txtfile);
	}
	public void readData(String txtfile) throws IOException {
		countryList = new LinkedList<>();
		Path path = Paths.get(txtfile);
		List<String> lines = Files.readAllLines(path);
		for (String line: lines) {
			String [] items = line.split(","); //splitting strings of data that was read in, into individual data to be stored in varibales.
			String name = items[0];
			String capital = items[1];
			int population = Integer.parseInt(items[2]);
			Country c = new Country(name,capital,population); //creating instance of object from data obtained through txt file. 
			countryList.add(c);
		}
	}
	public void game() {
		while(true) {
			int n = ThreadLocalRandom.current().nextInt(0, countryList.size());//random number generating between 0 and size of list
			String randomcountry = countryList.get(n).getName();
			String rcapital = countryList.get(n).getCapital();
			int rpopulation = countryList.get(n).getPopulation();
			out.printf("What's the capital of %s? ", randomcountry);
			String userguess = input.nextLine();
			if(userguess.equalsIgnoreCase(rcapital)) {
				out.println("Well done!");
			} else {
				out.printf("Incorrect. It's %s\n", rcapital);
			}
			out.printf("%s is a country of %d million\n", randomcountry, rpopulation);
			out.print("\nPlay again? (y/n): ");
			if(input.nextLine().equalsIgnoreCase("n")) {
				out.println("Bye!");
				return;//break; (return finishes the whole method, break stops the loop.
			}
			out.print("\n");
		}
	}
}

