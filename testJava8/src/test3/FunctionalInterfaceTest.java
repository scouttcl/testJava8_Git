package test3;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		Predicate<String> pre = (s) -> {
			s.trim();
			return s.length() > 0;
		};
		
		System.out.println("\"foo\" test:" + pre.test("foo"));
		System.out.println("\"foo\" negate, then test:" + pre.negate().test("foo"));
		
		Predicate<Boolean> pre_nonNull = Objects::nonNull;
		Predicate<Boolean> pre_isNull = Objects::isNull;
		System.out.println("nonNull:" + pre_nonNull.test(new Boolean(false)));
		System.out.println("isNull:" + pre_isNull.test(new Boolean(false)));
		
		Predicate<String> pre_isEmpty = String::isEmpty;
		Predicate<String> pre_isNotEmpty = pre_isEmpty.negate();
		System.out.println("pre_isEmpty:" + pre_isEmpty.test(""));
		System.out.println("pre_isNotEmpty:" + pre_isNotEmpty.test("112"));
		
		Function<String,Integer> toIntegerFunction = Integer::valueOf;
		Function<String,String> backToStrFunction = toIntegerFunction.andThen(String::valueOf);
		System.out.println("toIntegerFunction:" + toIntegerFunction.apply("999"));
		System.out.println("backToStrFunction:" + backToStrFunction.apply("888"));
		
//		函数组合之compose, 先执行compose里的参数部分，再执行compose的调用者
		Function<Integer,Integer> times2 = e -> e * 2;
		Function<Integer,Integer> squared = e -> e * e;
		Integer times2Res = times2.compose(squared).apply(6);
		Integer squaredRes = squared.compose(times2).apply(6);
		System.out.println("compose squared:" + times2Res);
		System.out.println("compose times2:" + squaredRes);
		
//		函数组合之andThen，先执行andThen的调用者，再执行andThen里的参数部分
		Function<Integer,Boolean> biggerThan = n -> n > 100;
		Function<Boolean,Integer> positive_negative = flag -> flag == true? 1:-1;
		Integer biggerRes = biggerThan.andThen(positive_negative).apply(123);
	}

}
