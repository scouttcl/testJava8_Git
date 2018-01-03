package test2;
@FunctionalInterface
public interface Convertor<T,N> {

	public N convertString(T t);
}
