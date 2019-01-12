package myfocus;

public class Tester_01 {

	static int printMe(int n) {
		if (n == 1) {
			return n;
		}
		return printMe(n - 1) * n;
	}

	public static void main(String[] args) {
		System.out.println(printMe(3));

	}

}
