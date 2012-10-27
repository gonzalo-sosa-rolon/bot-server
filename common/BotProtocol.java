package common;

import java.util.List;

import util.ListUtil;
import util.ObjectUtil;
import util.StringUtil;

public class BotProtocol {

	private static final String moveMouseHeader = "moveMouse";
	private static final String writeTextHeader = "writeText";
	private static final String delimiter = "&"; 

	public static Action parseAction(String content) {

		Action result = null;

		if (!StringUtil.isEmpty(content)) {
			List<String> values = ListUtil.split(content, BotProtocol.delimiter);

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
				result = parseMoveMouseAction(values);
			}
		}

		return result;
	}

	public static String getMoveMouseMessage(Integer deltaY, Integer deltaX) {

		String result = null;

		if (deltaX != null && deltaY != null) {
			result = BotProtocol.moveMouseHeader + "&" + deltaX + BotProtocol.delimiter + deltaY;
		}

		return result;
	}


	public static String getWriteTextMessage(String text) {

		String result = null;

		if (!StringUtil.isEmpty(text)) {
			result = BotProtocol.writeTextHeader +  "&" +  text;
		}

		return result;
	}

	private static Action parseMoveMouseAction(List<String> values) {

		Action result = null;

		if (values != null && values.size() > 2) {
			Integer deltaX = StringUtil.stringToInt(values.get(1));
			Integer deltaY = StringUtil.stringToInt(values.get(2));

			if (deltaX != null && deltaY != null) {
				result = new MoveMouseAction(deltaX, deltaY);
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
