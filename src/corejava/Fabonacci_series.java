package corejava;

public class Fabonacci_series {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int count = 10;
		System.out.print(" " + b);
		for (int i = 0; i < count; i++) {
			
			int c = a + b;
			
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
}
