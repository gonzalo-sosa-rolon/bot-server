package util;

public class StringUtil {

	public static boolean isEmpty(String message) {
		return message == null || message.length() == 0;
	}

	public static Integer stringToInt(String value) {
		Integer result = null;

		if (value != null) {
			try {
				result = Integer.parseInt(value);
			} catch (Exception e) {
				result = null;
			}
		}

		return result;
	}
}
