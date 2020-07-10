
public class Main {
	public static void introduceOneself() {
		String name = "たかし";
		int age = 12;
		double height = 190.8;
		char zodiac = '子';
		System.out.println("プロフィール: "+ name +","+ age +"歳,"+ zodiac +"年,"+ height +"cm");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address +"に、以下のメールを送信しました");
		System.out.println("件名:"+ title);
		System.out.println("本文:"+ text);
	}

	public static void email(String address, String text) {
		System.out.println(address+ "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+ text);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom*height/2;
		return ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = radius*radius*3.14;
		return ans;
	}
	public static void main(String[] args) {
		introduceOneself();
		email("こんにちは", "aiueo123@gmail.com", "テスト送信");
		email("overload@gmail.com", "引数を減らしました");
		double triangleAnswer = calcTriangleArea(3, 5);
		double circleAnswer = calcCircleArea(5);
		System.out.println("三角形の面積:"+ triangleAnswer);
		System.out.println("円の面積:"+ circleAnswer);
	}
}
