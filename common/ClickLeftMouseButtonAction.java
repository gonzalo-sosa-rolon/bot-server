package common;

import services.MouseService;

public class ClickLeftMouseButtonAction implements Action {

	private MouseService _mouseService;

	@Override
	public void exec() {
		this._mouseService = MouseService.getInstance();		
		this._mouseService.clickLeftButton();
	}

}
