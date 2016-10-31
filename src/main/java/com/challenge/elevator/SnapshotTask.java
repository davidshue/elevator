package com.challenge.elevator;

import java.util.TimerTask;

/**
 * Created by dshue1 on 10/29/16.
 */
public class SnapshotTask extends TimerTask {
	private CallSystem callSystem;
	public SnapshotTask(CallSystem callSystem) {
		this.callSystem = callSystem;
	}

	@Override
	public void run() {
		System.out.println("------------ begin SNAPSHOT ------------");
		callSystem.getElevators().forEach(elevator -> System.out.println("------ " + elevator + " ---------"));
		System.out.println("------------ end SNAPSHOT ------------");
	}
}
