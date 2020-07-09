
public class Main {
	public static void main(String[] args) {
		hello();
	}

	// メソッド定義の際は他の人が分かりやすいような命名を心がける
	public static void hello() {
		System.out.println("メソッド呼び出しました");
		shutDown();
	}

	public static void shutDown() {
		System.out.println("終了します");
	}
}
