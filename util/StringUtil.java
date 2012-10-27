package util;

public class StringUtil {

	public static boolean isEmpty(String message) {
		return message == null || message.length() == 0;
	}

	public static Integer stringToInt(String value) {
		Integer result = null;

		if (value != null) {
			result = Integer.parseInt(value);
		}

		return result;
	}
}
