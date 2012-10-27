package util;

public class ObjectUtil {

	public static boolean equals(Object ob1, Object ob2) {

		boolean result = false;

		result = ob1 == ob2;

		if (!result && ob1 != null && ob2 != null) {
			result = ob1.equals(ob2);
		}

		return result;
	}
}
