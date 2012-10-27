package common;


import services.KeyboardService;

public class WriteTextAction implements Action {

	private KeyboardService _keyboardService;
	private String _text;

	public WriteTextAction(String text) {
		this._text = text;
		this._keyboardService = KeyboardService.getInstance();
	}

	@Override
	public void exec() {
		this._keyboardService.type(this._text);
	}

}
