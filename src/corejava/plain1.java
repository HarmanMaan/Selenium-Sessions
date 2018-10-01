package corejava;

import org.testng.annotations.Test;

public class plain1 {
	@Test
	public void f() {
		String str, reverse = "";
		str = "liril";
		System.out.println(str.length());
		System.out.println(str);

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i); // reverse += str.charAt(i)

		}

		if (str.equals(reverse))
			System.out.println("Its a palin");
		else
			System.out.println("Its not a palin");

	}
}