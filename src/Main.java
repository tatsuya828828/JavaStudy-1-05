
public class Main {
	public static int add(int x, int y, int z) {
		return x+y+z;
	}
	public static int add(int x, int y) {
		return x+y;
	}

	public static double add(double x, double y) {
		return x+y;
	}

	public static String add(String x, String y) {
		return x+y;
	}

	public static void main(String[] args) {
		// 同じ名前のメソッドでも引数の型や数が違えば利用することができる
		// 戻り値の方だけが異なるものは利用できない
		// 呼び出す際は、引数でどのメソッドを呼び出すか判断される
		System.out.println(add("Hello","World"));
		System.out.println(add(10,50));
		System.out.println(add(3.5,4.2));
		System.out.println(add(4,5,6));
	}
}
