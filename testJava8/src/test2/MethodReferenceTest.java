package test2;

public class MethodReferenceTest {

	public static void main(String[] args) {
		Convertor<String,Integer> con = str -> Integer.parseInt(str);
		System.out.println("Lambda style:" + con.convertString("211"));
		
		Convertor<String,Integer> conRef = Integer::parseInt;
		System.out.println("Reference style:" + conRef.convertString("232"));
		
		MethodReferenceTest mrt = new MethodReferenceTest();
		Convertor<String,String> conRef2 = mrt::startsWith;
		System.out.println("Reference String style:" + conRef2.convertString("Java"));
		
//		if num don't use final key words, complier will make it as final type implicitly
		int num = 1;
		Convertor<Integer,String> conLambda = from -> String.valueOf(from + num);
		
	}

	public String startsWith(String str) {
		return String.valueOf(str.charAt(0));
	}
}
