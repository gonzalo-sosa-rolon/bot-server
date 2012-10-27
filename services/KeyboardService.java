package services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class KeyboardService {

	private static KeyboardService instance = null;
	public static KeyboardService getInstance() {
		if (KeyboardService.instance == null) {
			KeyboardService.instance = new KeyboardService();
		}

		return KeyboardService.instance;
	}

	private Robot _robot;

	private KeyboardService() {
		try {
			this._robot = new Robot();
		} catch (Exception e) {

		}
	}

	// TODO falta ver el tema de las mayuculas
	public List<Integer> getCharCode(char value) {

		List<Integer> result = new ArrayList<Integer>();

		switch (value) {
		case 'a':
			result.add(KeyEvent.VK_A);
			break;
		case 'b':
			result.add(KeyEvent.VK_B);
			break;

		case 'c':
			result.add(KeyEvent.VK_C);
			break;

		case 'd':
			result.add(KeyEvent.VK_D);
			break;

		case 'e':
			result.add(KeyEvent.VK_E);
			break;

		case 'f':
			result.add(KeyEvent.VK_F);
			break;

		case 'g':
			result.add(KeyEvent.VK_G);
			break;

		case 'h':
			result.add(KeyEvent.VK_H);
			break;

		case 'i':
			result.add(KeyEvent.VK_I);
			break;

		case 'j':
			result.add(KeyEvent.VK_J);
			break;

		case 'k':
			result.add(KeyEvent.VK_K);
			break;

		case 'l':
			result.add(KeyEvent.VK_L);
			break;

		case 'm':
			result.add(KeyEvent.VK_M);
			break;

		case 'n':
			result.add(KeyEvent.VK_N);
			break;

		case 'o':
			result.add(KeyEvent.VK_O);
			break;

		case 'p':
			result.add(KeyEvent.VK_P);
			break;

		case 'q':
			result.add(KeyEvent.VK_Q);
			break;

		case 'r':
			result.add(KeyEvent.VK_R);
			break;

		case 's':
			result.add(KeyEvent.VK_S);
			break;

		case 't':
			result.add(KeyEvent.VK_T);
			break;

		case 'u':
			result.add(KeyEvent.VK_U);
			break;

		case 'v':
			result.add(KeyEvent.VK_V);
			break;

		case 'w':
			result.add(KeyEvent.VK_W);
			break;

		case 'x':
			result.add(KeyEvent.VK_X);
			break;

		case 'y':
			result.add(KeyEvent.VK_Y);
			break;

		case 'z':
			result.add(KeyEvent.VK_Z);
			break;

		case 'A':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_A);
			break;

		case 'B':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_B);
			break;

		case 'C':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_C);
			break;

		case 'D':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_D);
			break;

		case 'E':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_E);
			break;

		case 'F':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_F);
			break;

		case 'G':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_G);
			break;

		case 'H':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_H);
			break;

		case 'I':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_I);
			break;

		case 'J':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_J);
			break;

		case 'K':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_K);
			break;

		case 'L':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_L);
			break;

		case 'M':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_M);
			break;

		case 'N':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_N);
			break;

		case 'O':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_O);
			break;

		case 'P':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_P);
			break;

		case 'Q':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_Q);
			break;

		case 'R':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_R);
			break;

		case 'S':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_S);
			break;

		case 'T':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_T);
			break;

		case 'U':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_U);
			break;

		case 'V':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_V);
			break;

		case 'W':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_W);
			break;

		case 'X':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_X);
			break;

		case 'Y':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_Y);
			break;

		case 'Z':
			result.add(KeyEvent.VK_SHIFT);
			result.add(KeyEvent.VK_Z);
			break;

		case '`':
			result.add(KeyEvent.VK_BACK_QUOTE);
			break;

		case '0':
			result.add(KeyEvent.VK_0);
			break;

		case '1':
			result.add(KeyEvent.VK_1);
			break;

		case '2':
			result.add(KeyEvent.VK_2);
			break;

		case '3':
			result.add(KeyEvent.VK_3);
			break;

		case '4':
			result.add(KeyEvent.VK_4);
			break;

		case '5':
			result.add(KeyEvent.VK_5);
			break;

		case '6':
			result.add(KeyEvent.VK_6);
			break;

		case '7':
			result.add(KeyEvent.VK_7);
			break;

		case '8':
			result.add(KeyEvent.VK_8);
			break;

		case '9':
			result.add(KeyEvent.VK_9);
			break;

		case '-':
			result.add(KeyEvent.VK_MINUS);
			break;

		case '=':
			result.add(KeyEvent.VK_EQUALS);
			break;

		case '~':
			result.add(KeyEvent.VK_BACK_QUOTE);
			break;

		case '!':
			result.add(KeyEvent.VK_EXCLAMATION_MARK);
			break;

		case '@':
			result.add(KeyEvent.VK_AT);
			break;

		case '#':
			result.add(KeyEvent.VK_NUMBER_SIGN);
			break;

		case '$':
			result.add(KeyEvent.VK_DOLLAR);
			break;

		case '%':
			result.add(KeyEvent.VK_5);
			break;

		case '^':
			result.add(KeyEvent.VK_CIRCUMFLEX);
			break;

		case '&':
			result.add(KeyEvent.VK_AMPERSAND);
			break;

		case '*':
			result.add(KeyEvent.VK_ASTERISK);
			break;

		case '(':
			result.add(KeyEvent.VK_LEFT_PARENTHESIS);
			break;

		case ')':
			result.add(KeyEvent.VK_RIGHT_PARENTHESIS);
			break;

		case '_':
			result.add(KeyEvent.VK_UNDERSCORE);
			break;

		case '+':
			result.add(KeyEvent.VK_PLUS);
			break;

		case '\t':
			result.add(KeyEvent.VK_TAB);
			break;

		case '\n':
			result.add(KeyEvent.VK_ENTER);
			break;

		case '[':
			result.add(KeyEvent.VK_OPEN_BRACKET);
			break;

		case ']':
			result.add(KeyEvent.VK_CLOSE_BRACKET);
			break;

		case '\\':
			result.add(KeyEvent.VK_BACK_SLASH);
			break;

		case '{':
			result.add(KeyEvent.VK_OPEN_BRACKET);
			break;

		case '}':
			result.add(KeyEvent.VK_CLOSE_BRACKET);
			break;

		case '|':
			result.add(KeyEvent.VK_BACK_SLASH);
			break;

		case ';':
			result.add(KeyEvent.VK_SEMICOLON);
			break;

		case ':':
			result.add(KeyEvent.VK_COLON);
			break;

		case '\'':
			result.add(KeyEvent.VK_QUOTE);
			break;

		case '"':
			result.add(KeyEvent.VK_QUOTEDBL);
			break;

		case ',':
			result.add(KeyEvent.VK_COMMA);
			break;

		case '<':
			result.add(KeyEvent.VK_LESS);
			break;

		case '.':
			result.add(KeyEvent.VK_PERIOD);
			break;

		case '>':
			result.add(KeyEvent.VK_GREATER);
			break;

		case '/':
			result.add(KeyEvent.VK_SLASH);
			break;

		case '?':
			result.add(KeyEvent.VK_SLASH);
			break;

		case ' ':
			result.add(KeyEvent.VK_SPACE);
			break;

		}

		return result;
	}

	public void type(String value) {

		if (value != null) {
			char values[] = value.toCharArray();

			for (char charValue : values) {
				List<Integer> keys = this.getCharCode(charValue);

				for (Integer key : keys) {
					this._robot.keyPress(key);
					try {
						Thread.sleep(10);
					} catch (Exception e) {
					}
				}
				for (Integer key : keys) {
					this._robot.keyRelease(key);
				}
			}
		}
	}
}
