package entidades;

public class Color {
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public Color(String color) {
		this.color=color;
	}
	
	public String toString() {
		return this.getColor();
	}
	
}
