package part0;

public class Livre {
	private String name;
	private float price;
	private int quantite;
	
	public Livre (String name, float price, int quantite) {
		this.name = name;
		this.price = price;
		this.quantite = quantite;
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public String toString() {
		return name + " : " + price + "€ (" + quantite + " en stock)";
	}
}
