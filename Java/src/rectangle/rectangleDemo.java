package rectangle;

public class rectangleDemo {
	public static void main(String[] args) {
		rectangle o = new rectangle();
		o.setLength(3);
		o.setBreath(4);
		o.setArea();
		System.out.println(o.toString());
	}
}
