package test2;

public class Computer {

	private String name;
	private String type;
	private double price;
	private String cpu;

	public Computer() {

	}

	public Computer(String name) {
		this.name = name;
	}

	public Computer(String name, String type, double price, String cpu) {
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

	public String toString() {
		return "Name:" + this.getName() + ",\nType:" + this.getType() + ",\nPrice:" + this.getPrice()
				+ ",\nCPU:" + this.getCpu();
	}

	public static void main(String[] args) {
		ComputerFactory<SmartPhone> factory = SmartPhone::new;
		SmartPhone sp = factory.createComputer("HTC_U11", "smartPhone", 4999.0, "SnapDragon 835");
		System.out.println(sp.toString());
	}

}
