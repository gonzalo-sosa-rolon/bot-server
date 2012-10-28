package services;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;

import model.Coordinates;

public class MouseService {

	private static MouseService instance;
	public static MouseService getInstance() {

		if (MouseService.instance == null) {
			MouseService.instance = new MouseService();
		}

		return MouseService.instance;		
	}

	private Robot _robot;

	private MouseService() {
		try {
			this._robot = new Robot();
		} catch (Exception e) {

		}
	}

	public Coordinates getMouseCoordinates() {

		Coordinates result = new Coordinates();

		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();

		result.x = b.x;
		result.y = b.y;

		return result;
	}

	public void scrollMouse(int scroll) {
		this._robot.mouseWheel(scroll);
	}

	public void clickLeftButton() {
		this._robot.mousePress(InputEvent.BUTTON1_MASK);
		this._robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	public void clickRightButton() {
		this._robot.mousePress(InputEvent.BUTTON3_MASK);
		this._robot.mouseRelease(InputEvent.BUTTON3_MASK);
	}

	public void moveMouse(int deltaX, int deltaY) {
		Coordinates coords = this.getMouseCoordinates();
		this._robot.mouseMove(coords.x + deltaX, coords.y + deltaY);
	}

	public void setMousePosition(int x, int y) {
		this._robot.mouseMove(x, y);
	}
}
