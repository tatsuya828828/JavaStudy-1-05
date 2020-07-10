
public class Main {
	public static void incArray(int[] array) {
		for(int value: array) {
			value++;
			System.out.println(value);
		}
	}

	public static void inc(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
			System.out.println(array[i]);
		}
	}

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = i;
		}
		return  newArray;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		// 拡張for分の場合
		incArray(array);
		for(int value: array) {
			System.out.println(value);
		}
		// for文の場合
		// 引数にアドレスを渡すことによって呼び出し先で加えた変更が呼び出し元でも反映される
		inc(array);
		for(int value: array) {
			System.out.println(value);
		}

		// 戻り値に配列を用いた場合
		int[] array2 = makeArray(5);
		for(int value: array2) {
			System.out.println(value);
		}
	}
}
