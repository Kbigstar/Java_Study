package result06;

public class Coffee {

	private String name;
	private int price;
	/**
	 * 
	 */
	public Coffee() {
	
	}
	/**
	 * @param name
	 * @param price
	 */
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "["+ name + ": " + price + "]";
	}

	
	
	
}
