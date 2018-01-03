package test1;

@FunctionalInterface
public interface MathOperation {

	int Operate(int a, int b);
	
	default int getSqrt(int a, int b) {
		return (int) Math.sqrt(a*a - b*b);
	};
	
	default void printParams(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
	}
}
