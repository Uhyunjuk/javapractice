package homework;

public class Game {
	private String name;
	public String food;
	public String color;

	public Game() {
		
	}

	public Game(String name, String food, String color) {
		this.name = name;
		this.food = food;
		this.color = color;
	}

	// getter
	public String getName() {
		return this.name;
	}
	
	public String getFood() {
		return this.food;
	}
	
	public String getColor() {
		return this.color;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
