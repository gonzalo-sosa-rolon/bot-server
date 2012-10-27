package util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

	public static List<String> split(String value, String token) {

		List<String> result = new ArrayList<String>();

		if (!StringUtil.isEmpty(value) && !StringUtil.isEmpty(token)) {
			String[] values = value.split(token);

			for (String nValue : values) {
				result.add(nValue);
			}
		}
		return result;
	}
}
