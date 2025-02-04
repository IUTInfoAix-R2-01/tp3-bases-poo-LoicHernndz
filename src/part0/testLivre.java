package part0;

public class testLivre {
	public static void main(String[] args) {
		Livre livre = new Livre ("Le Livre", 17.99f, 7);
		
		System.out.println(livre);
		System.out.println("Nom : " + livre.getName());
		System.out.println("Prix : " + livre.getPrice()+"€");
		System.out.println("Quantite : " + livre.getQuantite());
		
		System.out.println("---");
		livre.setQuantite(6);
		System.out.println("Quantite : " + livre.getQuantite());
	}
}
