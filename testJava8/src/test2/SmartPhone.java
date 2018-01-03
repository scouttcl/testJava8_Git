package test2;

public class SmartPhone extends Computer {

	private String name;
	private String type;
	private double price;
	private String cpu;
	
	public SmartPhone(String name) {
		this.name = name;
	}
	public SmartPhone(String name,String type,double price,String cpu) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.cpu = cpu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
}
