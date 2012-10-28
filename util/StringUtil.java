package util;

public class StringUtil {

	public static boolean isEmpty(String value) {
		return value == null || value.length() == 0;
	}

	public static boolean isNotEmpty(String value) {
		return !isEmpty(value);
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
