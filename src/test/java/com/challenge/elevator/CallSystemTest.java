package com.challenge.elevator;

import org.junit.Test;

/**
 * Created by dshue1 on 10/28/16.
 */
public class CallSystemTest {
	@Test
	public void test() throws Exception {
		CallSystem cs = new CallSystem(8, 100);

		//cs.getElevators().forEach(elevator -> System.out.println(elevator));

		Elevator elevator = cs.request(new CallRequest(Direction.up, 20));

		System.out.println("elevator responded:" + elevator);

		elevator.respond(50);

		System.out.println("elvator state " + elevator);

		elevator = cs.request(new CallRequest(Direction.down, 90));
		elevator.respond(1);

		elevator = cs.request(new CallRequest(Direction.up, 30));
		elevator.respond(50);

		Thread.sleep(50000);
	}
}
