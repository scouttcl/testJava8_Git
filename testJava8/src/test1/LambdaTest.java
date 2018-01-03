package test1;

import java.util.Locale;

public class LambdaTest {

	final static int DEMOINT = 3;
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> a * b;
		MathOperation division = (a, b) -> {
			int c = a / b;
			return c;
		};

		PrintMessage printMsg = word -> System.out.println("say:" + word);

		LambdaTest test = new LambdaTest();
		int result1 = test.operate(3, 5, addition);
		int result2 = test.operate(34, 53, subtraction);
		int result3 = test.operate(32, 6, multiplication);
		int result4 = test.operate(55, 4, division);

		System.out.println("addition:" + result1);
		System.out.println("subtraction:" + result2);
		System.out.println("multiplication:" + result3);
		System.out.println("division:" + result4);
		System.out.println("use addition by itself:" + addition.Operate(4, 6));

		test.printMsg("Hello Lambda!", printMsg);
		
		PrintMessage pm = msg -> System.out.println(msg + ",DEMOINT + 1:" + (DEMOINT + 1));
		pm.printMsg("hi");
		
		MathOperation mo = (a,b) -> {int c = a*a - b*b; return (int) Math.sqrt(c);};
		MathOperation mo2 = (a,b) -> (int)Math.sqrt(a*a + b*b);
		
		System.out.println("mo:" + mo.Operate(5, 4));
		
		PrintMessage printBigLetter = test::printBigLetterMsg;
		printBigLetter.printMsg("I love you, China, 我的祖国");
		
	}

	public int operate(int a, int b, MathOperation operation) {
		return operation.Operate(a, b);
	}

	public void printMsg(String word, PrintMessage printMsg) {
		printMsg.printMsg(word);
	}
	
	public void printBigLetterMsg(String word) {
		System.out.println("BIG LETTER:" + word.toUpperCase(Locale.CHINESE));
	}

	@FunctionalInterface
	interface PrintMessage {
		void printMsg(String word);
	}

}
