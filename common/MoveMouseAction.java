package common;

import services.MouseService;

public class MoveMouseAction implements Action {
	
	private Integer _deltaX;
	private Integer _deltaY;
	private MouseService _mouseService;
	
	public MoveMouseAction(Integer deltaX, Integer deltaY) {
		this._deltaX = deltaX;
		this._deltaY = deltaY;
	}

	@Override
	public void exec() {
		_mouseService = MouseService.getInstance();		
		_mouseService.moveMouse(_deltaX, _deltaY);		
	}
}
