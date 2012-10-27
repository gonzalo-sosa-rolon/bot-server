package services;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

import model.Coordinates;

public class MouseService {

	private static MouseService instance;
	public static MouseService getInstance() {
		
		if (instance == null) {
			instance = new MouseService();
		}
		
		return instance;		
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

	public void moveMouse(int deltaX, int deltaY) {
		Coordinates coords = this.getMouseCoordinates();
		this._robot.mouseMove(coords.x + deltaX, coords.y + deltaY);
	}

	public void setMousePosition(int x, int y) {
		this._robot.mouseMove(x, y);
	}
}
