package test.service.pgm;

public class MinusTest {

	public static void main(String[] args) {
		int i = -10;
		int plus = ~i+1;
		System.out.println("10 binary :"+Integer.toBinaryString(10));
		System.out.println("-10 の２の補数 binary :"+Integer.toBinaryString(plus));
		System.out.println("-10 binary :"+Integer.toBinaryString(i));
		String x = "xxx yyy";
		String x1 = "a";
		String[] xA = x.split(" ");
		System.out.println(xA.length);
		System.out.println(x1.compareToIgnoreCase("z"));
		
	}

}
