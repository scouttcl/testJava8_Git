package test2;

public interface ComputerFactory<C extends Computer> {

	C createComputer(String name, String type, double price, String cpu);
}
