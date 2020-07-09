
public class Main {
	public static void main(String[] args) {
		/* フィールドを作成してもメソッドのブロック外のため使えない
		String name = "湊";
		int age = 20;
		hello();
		しかし、引数として渡せば使える
		hello(name, age); */

		hello("湊", 20);
		// hello(20, "湊"); 引数の順番が違うとエラーになる
	}

	// メソッド定義の際は他の人が分かりやすいような命名を心がける
	public static void hello(String name, int age) {
		System.out.println("名前:"+ name);
		System.out.println("年齢:"+ age);
	}
}
