package com.challenge.elevator;

/**
 * Created by dshue1 on 10/28/16.
 */
public class CallRequest {
	private Direction direction;

	private int currentLevel;

	public CallRequest(Direction direction, int currentLevel) {
		this.direction = direction;
		this.currentLevel = currentLevel;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}
}
