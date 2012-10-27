package common;

import java.util.List;

import util.ListUtil;
import util.ObjectUtil;
import util.StringUtil;

public class BotProtocol {

	private static final String writeTextHeader = "writeText";
	private static final String moveMouseHeader = "moveMouse";

	public static Action parseAction(String content) {

		Action result = null;

		if (!StringUtil.isEmpty(content)) {
			List<String> values = ListUtil.split(content, "&");

			result = BotProtocol.parseAction(values);
		}

		return result;
	}

	private static Action parseAction(List<String> values) {
		Action result = null;

		if (values != null && values.size() > 0) {
			String header = values.get(0);

			if (ObjectUtil.equals(header, BotProtocol.writeTextHeader)) {
				result = BotProtocol.parseWriteTextAction(values);
			} else if (ObjectUtil.equals(header, BotProtocol.moveMouseHeader)) {

			}
		}

		return result;
	}

	private static Action parseWriteTextAction(List<String> values) {

		Action result = null;

		if (values != null && values.size() > 1) {
			String text = values.get(1);

			result = new WriteTextAction(text);
		}

		return result;
	}
}
