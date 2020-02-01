package epam.NewYearGift;

public class CoffeByte {
	String name = "Coffe Byte";
	String flavour = "Coffe flavour";
	int weight=5;
	
	CoffeByte(){
		
	}
	public void flavour() {
		// TODO Auto-generated method stub
		System.out.print("Coffee flavour");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the flavour
	 */
	public String getFlavour() {
		return flavour;
	}
	/**
	 * @param flavour the flavour to set
	 */
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
