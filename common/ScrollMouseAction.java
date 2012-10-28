package common;

import services.MouseService;

public class ScrollMouseAction implements Action {

	private MouseService _mouseService;
	private final int _scroll;

	public ScrollMouseAction(int scroll) {
		this._scroll = scroll;
	}

	@Override
	public void exec() {
		this._mouseService = MouseService.getInstance();		
		this._mouseService.scrollMouse(this._scroll);
	}

}
