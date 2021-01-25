package Model;

public class Product {

	private String vetements;
	private String accessoire;
	
	
	public Product(String vetements, String accessoire) {
		// TODO Auto-generated constructor stub
		this.vetements = vetements;
		this.accessoire = accessoire;
	}
	public String getVetements() {
		return vetements;
	}
	public void setVetements(String vetements) {
		this.vetements = vetements;
	}
	public String getAccessoire() {
		return accessoire;
	}
	public void setAccessoire(String accessoire) {
		this.accessoire = accessoire;
	}
}
