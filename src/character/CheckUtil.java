package character;

public class CheckUtil {
	/***
	 * ここでの数字以外入力されたかの判定を行います「
	 *
	 * @param s
	 * @return
	 */

	public static boolean  inputcheck(String s) {
		boolean a;
		try {
			// 文字列→数字の変換で例外が発生したら、falseを返す

			if (s.matches(".*" + "d" + ".*") || s.matches(".*" + "f" + ".*")) {
				return false;
			}
			double d = Double.parseDouble(s);

			if (d <= 0) {

				a = false;

			}else{
				a = true;
			}


		} catch (NumberFormatException e) {
			a = false;
		}
		return a;
	}


	public static boolean inputcheck(String s, boolean isMinus) {
		//isMinusはマイナスの値
		boolean a;
		try {
			// 文字列→数字の変換で例外が発生したら、falseを返す

			if (s.matches(".*" + "d" + ".*") || s.matches(".*" + "f" + ".*")) {
				return false;
			}
			double d = Double.parseDouble(s);

			if (!isMinus) {

				a = false;

			}else{
				a = true;
			}


		} catch (NumberFormatException e) {
			a = false;
		}
		return a;
	}
}
