package task_9;

public class Country {
	private String name;
	private String capital;
	private int population;
	
	public Country (String name, String capital, int population) { //paramterised constructor with three parameters.
		this.setName(name);
		this.setCapital(capital);
		this.setPopulation(population);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
